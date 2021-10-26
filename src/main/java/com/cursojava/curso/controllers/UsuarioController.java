package com.cursojava.curso.controllers;

import com.cursojava.curso.controllers.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    //Regresa lista de usuarios
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(10L);
        usuario.setNombre("Gustavo");
        usuario.setApellido("Castro");
        usuario.setEmail("gcastro@apinterface.com");
        usuario.setTelefono("6677510038");

        Usuario usuario2 = new Usuario();
        usuario2.setId(11L);
        usuario2.setNombre("María");
        usuario2.setApellido("González");
        usuario2.setEmail("maria.glez@gmail.com");
        usuario2.setTelefono("1234567890");

        Usuario usuario3 = new Usuario();
        usuario3.setId(12L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Aliaga");
        usuario3.setEmail("gabriel.ali@aphotmail.com");
        usuario3.setTelefono("1122334455");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
