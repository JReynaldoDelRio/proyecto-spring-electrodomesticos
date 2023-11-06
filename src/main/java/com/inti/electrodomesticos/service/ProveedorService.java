package com.inti.electrodomesticos.service;

import java.util.List;

import com.inti.electrodomesticos.entities.Proveedor;

public interface ProveedorService {

    public List<Proveedor> listarProveedores();

    public Proveedor registrarProveedor(Proveedor objProveedor);

    public Proveedor actualizarProveedor(Proveedor objProveedor);

    public void eliminarProveedor(int objProveedor);
}
