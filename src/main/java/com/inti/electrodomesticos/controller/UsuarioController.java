package com.inti.electrodomesticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.electrodomesticos.entities.Usuario;
import com.inti.electrodomesticos.service.UsuarioService;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService serviceUsuario;

    @GetMapping("/listar")
    public List<Usuario> listarUsuario() {
        return serviceUsuario.listarUsuario();
    }

    @PostMapping("/registrar/usuario")
    @ResponseBody
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return serviceUsuario.registrarUsuario(usuario);
    }

    @PutMapping("/actualizar/usuario")
    @ResponseBody
    public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
        return serviceUsuario.actualizarUsuario(usuario);
    }

    @DeleteMapping("/eliminar/usuario/{userid}")
    @ResponseBody
    public void eliminarUsuario(@PathVariable int userid) {
        serviceUsuario.eliminarUsuario(userid);
    }
}
