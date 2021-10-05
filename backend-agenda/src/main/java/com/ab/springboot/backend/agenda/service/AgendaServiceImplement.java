package com.ab.springboot.backend.agenda.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.springboot.backend.agenda.dato.AgendaDato;
import com.ab.springboot.backend.agenda.model.Agenda;

@Service
public class AgendaServiceImplement implements AgendaService {
	
	@Autowired
	private AgendaDato agendaDato;

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = false)
	public Agenda save(Agenda agenda) {
		// TODO Auto-generated method stub
		return agendaDato.save(agenda);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = false)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		agendaDato.deleteById(id);;
	}

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public Agenda finById(Integer id) {
		// TODO Auto-generated method stub
		return agendaDato.findById(id).orElse(null);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<Agenda> findAll() {
		// TODO Auto-generated method stub
		return (List<Agenda>) agendaDato.findAll();
	}

}
