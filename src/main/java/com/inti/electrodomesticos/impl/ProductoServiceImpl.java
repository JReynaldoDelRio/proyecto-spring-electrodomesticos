package com.inti.electrodomesticos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.electrodomesticos.entities.Producto;
import com.inti.electrodomesticos.repository.ProductoRepository;
import com.inti.electrodomesticos.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repoProducto;

    @Override
    public List<Producto> listarProductos() {
        // TODO Auto-generated method stub
        return repoProducto.findAll();
    }

    @Override
    public Producto registrarProducto(Producto objProducto) {
        // TODO Auto-generated method stub
        return repoProducto.save(objProducto);
    }

    @Override
    public Producto actualizarProducto(Producto objProducto) {
        // TODO Auto-generated method stub
        Producto producto = repoProducto.findById(objProducto.getProductid()).orElse(null);

        producto.setNombreproducto(objProducto.getNombreproducto());
        producto.setMarcaid(objProducto.getMarcaid());
        producto.setModelo(objProducto.getModelo());
        producto.setCategoriaid(objProducto.getCategoriaid());
        producto.setProductid(objProducto.getProveedorid());
        producto.setPrecio(objProducto.getPrecio());
        producto.setDimensiones(objProducto.getDimensiones());
        producto.setDimensiones(objProducto.getDimensiones());
        producto.setCapacidad(objProducto.getCapacidad());
        producto.setClasificacionenergetica(objProducto.getClasificacionenergetica());
        producto.setConsumoenergia(objProducto.getConsumoenergia());
        producto.setCaracterísticasespeciales(objProducto.getCaracterísticasespeciales());
        producto.setDescripción(objProducto.getDescripción());
        producto.setImagen(objProducto.getImagen());

        return repoProducto.save(objProducto);

    }

    @Override
    public void eliminarProducto(int objProducto) {
        // TODO Auto-generated method stub
        repoProducto.deleteById(objProducto);
    }

}
