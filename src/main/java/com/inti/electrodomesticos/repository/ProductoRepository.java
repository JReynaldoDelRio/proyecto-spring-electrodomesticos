package com.inti.electrodomesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.electrodomesticos.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
