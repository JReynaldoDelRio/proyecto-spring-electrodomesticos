package com.inti.electrodomesticos.service;

import java.util.List;

import com.inti.electrodomesticos.entities.Categoria;

public interface CategoriaService {

    public List<Categoria> listarCategorias();

    public Categoria registrarCategoria(Categoria objCategoria);

    public Categoria actualizarCategoria(Categoria objCategoria);

    public void eliminarCategoria(int objCategoria);

}
