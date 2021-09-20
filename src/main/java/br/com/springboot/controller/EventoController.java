package br.com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.Evento;
import br.com.springboot.service.EventoService;

@RestController
@RequestMapping(value = "/eventos")
public class EventoController {

  @Autowired
  private EventoService service;

  @GetMapping(value = "buscar_por_id/{idEvento}")
  @ResponseStatus(HttpStatus.OK)
  public Evento findById(@PathVariable Integer idEvento) {
    return service.findById(idEvento);
  }

  @PostMapping(value = "criarEvento")
  @ResponseStatus(HttpStatus.CREATED)
  public Evento save(@RequestBody Evento evento) {
    return service.save(evento);

  }

  @PostMapping(value = "todos_os_eventos")
  @ResponseStatus(HttpStatus.OK)
  public List<Evento> getAllEventos() {
    return service.findAll();
  }

  @DeleteMapping(value = "delete_evento/{idEvento}")
  public void delete(@PathVariable Integer idEvento) {
    service.delete(idEvento);

  }

}
