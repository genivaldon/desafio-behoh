package br.com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.model.Evento;
import br.com.springboot.repository.EventoRepository;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public Evento findById(Integer idEvento) {
        return eventoRepository
        .findById(idEvento)
        .orElseThrow(() -> new RuntimeException("Objeto não encontrado!"));

    }
    
}
