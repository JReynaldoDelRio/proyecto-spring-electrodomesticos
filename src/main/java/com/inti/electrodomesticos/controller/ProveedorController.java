package com.inti.electrodomesticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.electrodomesticos.entities.Proveedor;
import com.inti.electrodomesticos.service.ProveedorService;

@RestController
public class ProveedorController {

    @Autowired
    private ProveedorService serviceProveedor;

    @GetMapping("/listar/proveedor")
    @ResponseBody
    public List<Proveedor> listarProveedor() {
        return serviceProveedor.listarProveedores();
    }

    @PostMapping("/registrar/proveedor")
    @ResponseBody
    public Proveedor registrarProveedor(@RequestBody Proveedor proveedor) {
        return serviceProveedor.registrarProveedor(proveedor);
    }

    @PutMapping("/actualizar/proveedor")
    @ResponseBody
    public Proveedor actualizarProveedor(@RequestBody Proveedor proveedor) {
        return serviceProveedor.actualizarProveedor(proveedor);
    }

    @DeleteMapping("/eliminar/proveedor/{proveedorid}")
    @ResponseBody
    public void eliminarCarrito(@PathVariable int proveedorid) {
        serviceProveedor.eliminarProveedor(proveedorid);
    }
}
