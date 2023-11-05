package com.inti.electrodomesticos.service;

import java.util.List;

import com.inti.electrodomesticos.entities.DetalleCarrito;

public interface DetalleCarritoService {

    public List<DetalleCarrito> listarDetalleCarrito();

    public DetalleCarrito registrarDetalleCarrito(DetalleCarrito objDetalleCarrito);

    public DetalleCarrito actualizarDetalleCarrito(DetalleCarrito objDetalleCarrito);

    public void eliminarDetalleCarrito(int objDetalleCarrito);
}
