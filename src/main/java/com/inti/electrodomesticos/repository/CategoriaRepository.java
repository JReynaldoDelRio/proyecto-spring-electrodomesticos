package com.inti.electrodomesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.electrodomesticos.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
