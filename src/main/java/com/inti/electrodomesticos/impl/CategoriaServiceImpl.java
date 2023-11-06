package com.inti.electrodomesticos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.electrodomesticos.entities.Categoria;
import com.inti.electrodomesticos.repository.CategoriaRepository;
import com.inti.electrodomesticos.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepo;

    @Override
    public List<Categoria> listarCategorias() {
        // TODO Auto-generated method stub
        return categoriaRepo.findAll();
    }

    @Override
    public Categoria registrarCategoria(Categoria objCategoria) {
        // TODO Auto-generated method stub
        return categoriaRepo.save(objCategoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria objCategoria) {
        // TODO Auto-generated method stub
        Categoria categoria = categoriaRepo.findById(objCategoria.getCategoriaid()).orElse(null);

        categoria.setNombrecategoria(objCategoria.getNombrecategoria());

        return categoriaRepo.save(objCategoria);

    }

    @Override
    public void eliminarCategoria(int objCategoria) {
        // TODO Auto-generated method stub
        categoriaRepo.deleteById(objCategoria);
    }

}
