package com.inti.electrodomesticos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String abrirHome() {
        return "index";
    }

    @GetMapping("/mantenimientoProducto")
    public String abrirMantProduct() {
        return "mantenimientoProducto";
    }
}
