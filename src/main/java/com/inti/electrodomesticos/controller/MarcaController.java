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

import com.inti.electrodomesticos.entities.Marca;
import com.inti.electrodomesticos.service.MarcaService;

@RestController
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("/listar/marca")
    @ResponseBody
    public List<Marca> listarProveedor() {
        return marcaService.listarMarcas();
    }

    @PostMapping("/registrar/marca")
    @ResponseBody
    public Marca registrarProveedor(@RequestBody Marca marca) {
        return marcaService.registrarMarca(marca);
    }

    @PutMapping("/actualizar/marca")
    @ResponseBody
    public Marca actualizarProveedor(@RequestBody Marca marca) {
        return marcaService.actualizarMarca(marca);
    }

    @DeleteMapping("/eliminar/marca/{marcaid}")
    @ResponseBody
    public void eliminarCarrito(@PathVariable int marcaid) {
        marcaService.eliminarMarca(marcaid);
    }
}
