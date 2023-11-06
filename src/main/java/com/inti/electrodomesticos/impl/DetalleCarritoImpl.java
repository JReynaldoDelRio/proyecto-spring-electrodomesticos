package com.inti.electrodomesticos.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.electrodomesticos.entities.DetalleCarrito;
import com.inti.electrodomesticos.entities.Producto;
import com.inti.electrodomesticos.repository.DetalleCarritoRepository;
import com.inti.electrodomesticos.repository.ProductoRepository;
import com.inti.electrodomesticos.service.DetalleCarritoService;

@Service
public class DetalleCarritoImpl implements DetalleCarritoService {

    @Autowired
    private DetalleCarritoRepository detalleRepo;

    @Autowired
    private ProductoRepository productoRepo;

    @Override
    public List<DetalleCarrito> listarDetalleCarrito() {
        // TODO Auto-generated method stub
        return detalleRepo.findAll();
    }

    @Override
    public DetalleCarrito registrarDetalleCarrito(DetalleCarrito objDetalleCarrito) {
        // TODO Auto-generated method stub
        int productId = objDetalleCarrito.getProductoid();
        int cantidad = objDetalleCarrito.getCantidad();

        Optional<Producto> productoOptional = productoRepo.findById(productId);
        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            BigDecimal precio = producto.getPrecio();
            BigDecimal subTotal = precio.multiply(BigDecimal.valueOf(cantidad));
            objDetalleCarrito.setSubtotal(subTotal);

            return detalleRepo.save(objDetalleCarrito);
        } else {
            throw new RuntimeException("Producto no encontrado");
        }
    }

    @Override
    public DetalleCarrito actualizarDetalleCarrito(DetalleCarrito objDetalleCarrito) {
        int productId = objDetalleCarrito.getProductoid();
        int cantidad = objDetalleCarrito.getCantidad();

        Optional<Producto> productoOptional = productoRepo.findById(productId);
        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            BigDecimal precio = producto.getPrecio();
            BigDecimal subTotal = precio.multiply(BigDecimal.valueOf(cantidad));
            objDetalleCarrito.setSubtotal(subTotal);

            Optional<DetalleCarrito> detalleExistenteOptional = detalleRepo.findById(objDetalleCarrito.getDetailid());
            if (detalleExistenteOptional.isPresent()) {
                DetalleCarrito detalleExistente = detalleExistenteOptional.get();
                detalleExistente.setCantidad(objDetalleCarrito.getCantidad());
                detalleExistente.setSubtotal(subTotal);

                return detalleRepo.save(detalleExistente);
            }
        } else {
            throw new RuntimeException("Producto no encontrado");
        }
        return objDetalleCarrito;
    }

    @Override
    public void eliminarDetalleCarrito(int objDetalleCarrito) {
        // TODO Auto-generated method stub
        detalleRepo.deleteById(objDetalleCarrito);
    }

}
