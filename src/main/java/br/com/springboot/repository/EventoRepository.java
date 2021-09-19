package br.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
    
}
