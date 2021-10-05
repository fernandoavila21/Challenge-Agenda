package com.ab.springboot.backend.agenda.service;

import java.util.List;

import com.ab.springboot.backend.agenda.model.Agenda;

public interface AgendaService {
	
	public Agenda save(Agenda agenda);
	
	public void delete(Integer id);
	
	public Agenda finById(Integer id);
	
	public List<Agenda> findAll();

}
