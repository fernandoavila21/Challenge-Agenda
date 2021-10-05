package com.ab.springboot.backend.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.springboot.backend.agenda.model.Agenda;
import com.ab.springboot.backend.agenda.service.AgendaService;

@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("/api")
public class AgendaController {

	@Autowired
	private AgendaService agendaService;

	@PostMapping("/agenda")
	public Agenda save(@RequestBody Agenda agenda) {
		return agendaService.save(agenda);
	}
	
	@GetMapping("/agendas")
	public List<Agenda> agendas(){
		return agendaService.findAll();
		
	}
	
	@GetMapping("/agendas/{id}")
	public Agenda mostrar(@PathVariable Integer id) {
		return agendaService.finById(id);
		
	}
	
	@PutMapping("/agendas/{id}")
	public Agenda update(@RequestBody Agenda agenda, @PathVariable Integer id) {
		
		Agenda agendaActual = agendaService.finById(id);
		
		agendaActual.setNombre(agenda.getNombre());
		agendaActual.setNumero(agenda.getNumero());
		agendaActual.setCorreo(agenda.getCorreo());
		
		return agendaService.save(agendaActual);
	}
	
	@DeleteMapping("/agendas/{id}")
	public void delete(@PathVariable Integer id) {
		agendaService.delete(id);
	}
	

}
