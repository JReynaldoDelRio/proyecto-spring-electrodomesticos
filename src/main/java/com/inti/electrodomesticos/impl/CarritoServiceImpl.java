package com.inti.electrodomesticos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.electrodomesticos.entities.Carrito;
import com.inti.electrodomesticos.repository.CarritoRepository;
import com.inti.electrodomesticos.service.CarritoService;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public List<Carrito> listarCarrito() {
        // TODO Auto-generated method stub
        return carritoRepository.findAll();
    }

    @Override
    public Carrito registrarCarrito(Carrito objCarrito) {
        // TODO Auto-generated method stub
        return carritoRepository.save(objCarrito);
    }

    @Override
    public Carrito actualizarCarrito(Carrito objCarrito) {
        // TODO Auto-generated method stub
        Carrito carrito = carritoRepository.findById(objCarrito.getCardid()).orElse(null);

        if (carrito != null) {
            carrito.setUserid(objCarrito.getUserid());
            return carritoRepository.save(carrito);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarCarrito(int objCarrito) {
        // TODO Auto-generated method stub
        carritoRepository.deleteById(objCarrito);
    }

}
