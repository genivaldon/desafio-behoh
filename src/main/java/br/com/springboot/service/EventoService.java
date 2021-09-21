package br.com.springboot.service;

import br.com.springboot.model.Evento;
import br.com.springboot.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

  @Autowired
  private EventoRepository eventoRepository;

  public Evento findById(Integer idEvento) {
    return eventoRepository
      .findById(idEvento)
      .orElseThrow(() -> new RuntimeException("Evento não encontrado!"));
  }

  public Evento save(Evento evento) {
    return this.eventoRepository.save(evento);
  }

  public List<Evento> findAll() {
    return eventoRepository.findAll();
  }

  public void delete(Integer idEvento) {
    this.eventoRepository.deleteById(idEvento);
  }
}
