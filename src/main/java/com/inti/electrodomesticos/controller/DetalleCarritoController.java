package com.inti.electrodomesticos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.electrodomesticos.entities.DetalleCarrito;
import com.inti.electrodomesticos.service.DetalleCarritoService;

@RestController
public class DetalleCarritoController {

    @Autowired
    private DetalleCarritoService serviceDetalle;

    @PostMapping("/registrar/detalle/carrito")
    @ResponseBody
    public DetalleCarrito registrarDetalleCarrito(@RequestBody DetalleCarrito detalleCarrito) {
        return serviceDetalle.registrarDetalleCarrito(detalleCarrito);
    }

}
