package com.inti.electrodomesticos.service;

import java.util.List;

import com.inti.electrodomesticos.entities.Carrito;

public interface CarritoService {

    public List<Carrito> listarCarrito();

    public Carrito registrarCarrito(Carrito objCarrito);

    public Carrito actualizarCarrito(Carrito objCarrito);

    public void eliminarCarrito(int objCarrito);

}
