package br.com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  
}
