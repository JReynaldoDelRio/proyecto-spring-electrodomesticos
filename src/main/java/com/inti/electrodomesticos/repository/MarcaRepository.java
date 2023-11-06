package com.inti.electrodomesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.electrodomesticos.entities.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {

}
