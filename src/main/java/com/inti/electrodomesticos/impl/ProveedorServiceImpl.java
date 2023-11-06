package com.inti.electrodomesticos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.electrodomesticos.entities.Proveedor;
import com.inti.electrodomesticos.repository.ProveedorRepository;
import com.inti.electrodomesticos.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepo;

    @Override
    public List<Proveedor> listarProveedores() {
        // TODO Auto-generated method stub
        return proveedorRepo.findAll();
    }

    @Override
    public Proveedor registrarProveedor(Proveedor objProveedor) {
        // TODO Auto-generated method stub
        return proveedorRepo.save(objProveedor);
    }

    @Override
    public Proveedor actualizarProveedor(Proveedor objProveedor) {
        // TODO Auto-generated method stub
        Proveedor proveedor = proveedorRepo.findById(objProveedor.getProveedorid()).orElse(null);
        proveedor.setNombreproveedor(objProveedor.getNombreproveedor());
        proveedor.setRuc(objProveedor.getRuc());
        proveedor.setDireccion(objProveedor.getDireccion());
        proveedor.setTelefono(objProveedor.getTelefono());
        proveedor.setCorreo(objProveedor.getCorreo());

        return proveedorRepo.save(objProveedor);

    }

    @Override
    public void eliminarProveedor(int objProveedor) {
        // TODO Auto-generated method stub
        proveedorRepo.deleteById(objProveedor);
    }

}
