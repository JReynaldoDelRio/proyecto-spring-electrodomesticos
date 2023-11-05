package com.inti.electrodomesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.electrodomesticos.entities.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

}
