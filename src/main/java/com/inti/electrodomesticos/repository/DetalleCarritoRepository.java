package com.inti.electrodomesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.electrodomesticos.entities.DetalleCarrito;

public interface DetalleCarritoRepository extends JpaRepository<DetalleCarrito, Integer> {

}
