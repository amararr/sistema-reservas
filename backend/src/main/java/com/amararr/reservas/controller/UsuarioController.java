package com.amararr.reservas.controller;

import com.amararr.reservas.entity.Usuario;
import com.amararr.reservas.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioService.obtenerTodos();
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }
}
