package br.com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.model.Usuario;
import br.com.springboot.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findById(Integer idUsuario){
        return usuarioRepository.findById(idUsuario).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    public Usuario save (Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public void delete (Integer idUsuario){
        this.usuarioRepository.deleteById(idUsuario);
    }

    

    
}
