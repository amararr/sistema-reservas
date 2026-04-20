package com.amararr.reservas.service;

import com.amararr.reservas.entity.Usuario;
import com.amararr.reservas.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

     public Usuario obtenerPorId(Long id) {
    return usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
   
}
