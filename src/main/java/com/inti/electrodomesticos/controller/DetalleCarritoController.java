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

import com.inti.electrodomesticos.entities.DetalleCarrito;
import com.inti.electrodomesticos.service.DetalleCarritoService;

@RestController
public class DetalleCarritoController {

    @Autowired
    private DetalleCarritoService serviceDetalle;

    @GetMapping("/listar/detalle-carrito")
    @ResponseBody
    public List<DetalleCarrito> listarDetalleCarrito() {
        return serviceDetalle.listarDetalleCarrito();
    }

    @PostMapping("/registrar/detalle-carrito")
    @ResponseBody
    public DetalleCarrito registrarDetalleCarrito(@RequestBody DetalleCarrito detalleCarrito) {
        return serviceDetalle.registrarDetalleCarrito(detalleCarrito);
    }

    @PutMapping("/actualizar/detalle-carrito/{id}")
    @ResponseBody
    public DetalleCarrito actualizarDetalleCarrito(@PathVariable int id, @RequestBody DetalleCarrito detalleCarrito) {
        detalleCarrito.setDetailid(id);
        return serviceDetalle.actualizarDetalleCarrito(detalleCarrito);
    }

    @DeleteMapping("/eliminar/detalle-carrito/{id}")
    @ResponseBody
    public void eliminarDetalleCarrito(@PathVariable int id) {
        serviceDetalle.eliminarDetalleCarrito(id);
    }

}
