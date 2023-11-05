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

import com.inti.electrodomesticos.entities.Producto;
import com.inti.electrodomesticos.service.ProductoService;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService serviceProducto;

    @GetMapping("/listar/producto")
    @ResponseBody
    public List<Producto> listarProductos() {
        return serviceProducto.listarProductos();
    }

    @PostMapping("/registrar/producto")
    @ResponseBody
    public Producto registrarProducto(@RequestBody Producto producto) {
        return serviceProducto.registrarProducto(producto);
    }

    @PutMapping("/actualizar/producto")
    @ResponseBody
    public Producto actualizarProducto(@RequestBody Producto producto) {
        return serviceProducto.registrarProducto(producto);
    }

    @DeleteMapping("/eliminar/producto/{productid}")
    @ResponseBody
    public void eliminarProducto(@PathVariable int productid) {
        serviceProducto.eliminarProducto(productid);
    }
}
