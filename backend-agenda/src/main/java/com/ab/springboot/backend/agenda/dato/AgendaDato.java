package com.ab.springboot.backend.agenda.dato;

import org.springframework.data.repository.CrudRepository;

import com.ab.springboot.backend.agenda.model.Agenda;

public interface AgendaDato extends CrudRepository<Agenda, Integer>{

}
