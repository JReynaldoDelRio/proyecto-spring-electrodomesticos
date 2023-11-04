package com.inti.electrodomesticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.electrodomesticos.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
