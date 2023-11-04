package com.inti.electrodomesticos.service;

import java.util.List;

import com.inti.electrodomesticos.entities.Usuario;

public interface UsuarioService {

    public List<Usuario> listarUsuario();

    public Usuario registrarUsuario(Usuario objUsuario);

    public Usuario actualizarUsuario(Usuario objUsuario);

    public void eliminarUsuario(int objUsuario);

}
