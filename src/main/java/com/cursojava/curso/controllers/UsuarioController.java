package com.cursojava.curso.controllers;

import com.cursojava.curso.controllers.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Gustavo");
        usuario.setApellido("Castro");
        usuario.setEmail("gcastro@apinterface.com");
        usuario.setTelefono("6677510038");

        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Gustavo");
        usuario.setApellido("Castro");
        usuario.setEmail("gcastro@apinterface.com");
        usuario.setTelefono("6677510038");

        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Gustavo");
        usuario.setApellido("Castro");
        usuario.setEmail("gcastro@apinterface.com");
        usuario.setTelefono("6677510038");

        return usuario;
    }


    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Gustavo");
        usuario.setApellido("Castro");
        usuario.setEmail("gcastro@apinterface.com");
        usuario.setTelefono("6677510038");

        return usuario;
    }
}
