package br.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
