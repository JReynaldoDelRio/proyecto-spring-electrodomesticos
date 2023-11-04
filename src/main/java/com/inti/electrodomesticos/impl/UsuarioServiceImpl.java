package com.inti.electrodomesticos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.electrodomesticos.entities.Usuario;
import com.inti.electrodomesticos.repository.UsuarioRepository;
import com.inti.electrodomesticos.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    public UsuarioRepository serviceUsuario;

    @Override
    public List<Usuario> listarUsuario() {
        // TODO Auto-generated method stub
        return serviceUsuario.findAll();
    }

    @Override
    public Usuario registrarUsuario(Usuario objUsuario) {
        // TODO Auto-generated method stub
        return serviceUsuario.save(objUsuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario objUsuario) {
        // TODO Auto-generated method stub
        Usuario usuario = serviceUsuario.findById(objUsuario.getUserid()).orElse(null);
        usuario.setCorreoelectronico(objUsuario.getCorreoelectronico());
        usuario.setContrasena(objUsuario.getContrasena());
        usuario.setRol(objUsuario.getRol());
        return serviceUsuario.save(objUsuario);
    }

    @Override
    public void eliminarUsuario(int objUsuario) {
        // TODO Auto-generated method stub
        serviceUsuario.deleteById(objUsuario);
    }

}
