package com.inti.electrodomesticos.service;

import java.util.List;

import com.inti.electrodomesticos.entities.Producto;

public interface ProductoService {

    public List<Producto> listarProductos();

    public Producto registrarProducto(Producto objProducto);

    public Producto actualizarProducto(Producto objProducto);

    public void eliminarProducto(int objProducto);
}
