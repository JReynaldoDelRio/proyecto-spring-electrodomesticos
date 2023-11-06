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

import com.inti.electrodomesticos.entities.Categoria;
import com.inti.electrodomesticos.service.CategoriaService;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listar/categoria")
    @ResponseBody
    public List<Categoria> listarCategoria() {
        return categoriaService.listarCategorias();
    }

    @PostMapping("/registrar/categoria")
    @ResponseBody
    public Categoria registrarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.registrarCategoria(categoria);
    }

    @PutMapping("/actualizar/categoria")
    @ResponseBody
    public Categoria actualizarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.actualizarCategoria(categoria);
    }

    @DeleteMapping("/eliminar/categoria/{categoriaid}")
    @ResponseBody
    public void eliminarCategoria(@PathVariable int categoriaid) {
        categoriaService.eliminarCategoria(categoriaid);
    }
}
