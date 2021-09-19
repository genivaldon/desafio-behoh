package br.com.springboot.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.model.Evento;
import br.com.springboot.model.Usuario;
import br.com.springboot.repository.EventoRepository;
import br.com.springboot.repository.UsuarioRepository;

@Service
public class DBService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void instanciaBaseDeDados() {

        Evento e1 = new Evento(null, "palestra-Spring", 40);

        Usuario u1 = new Usuario(null, "genivaldo");

        u1.addEvento(e1);

        eventoRepository.saveAll(Arrays.asList(e1));

        usuarioRepository.saveAll(Arrays.asList(u1));

    }

}
