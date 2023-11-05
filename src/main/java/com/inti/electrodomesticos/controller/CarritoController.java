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

import com.inti.electrodomesticos.entities.Carrito;
import com.inti.electrodomesticos.service.CarritoService;

@RestController
public class CarritoController {

    @Autowired
    private CarritoService serviceCarrito;

    @GetMapping("/listar/carrito")
    @ResponseBody
    public List<Carrito> listarCarrito() {
        return serviceCarrito.listarCarrito();
    }

    @PostMapping("/registrar/carrito")
    @ResponseBody
    public Carrito registrarCarrito(@RequestBody Carrito carrito) {
        return serviceCarrito.registrarCarrito(carrito);
    }

    @PutMapping("/actualizar/carrito")
    @ResponseBody
    public Carrito actualizarCarrito(@RequestBody Carrito carrito) {
        return serviceCarrito.actualizarCarrito(carrito);
    }

    @DeleteMapping("/eliminar/carrito/{cardid}")
    @ResponseBody
    public void eliminarCarrito(@PathVariable int cardid) {
        serviceCarrito.eliminarCarrito(cardid);
    }
}
