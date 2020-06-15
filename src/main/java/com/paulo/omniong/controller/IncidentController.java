package com.paulo.omniong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.omniong.model.Incident;
import com.paulo.omniong.service.IncidentService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/profile")
public class IncidentController {

	@Autowired private IncidentService incidentService;
	
	@PostMapping
	public Incident salvar(@RequestBody Incident incident) {
		return incidentService.salvar(incident);
	}
	
	@GetMapping("/{id}")
	public List<Incident> getByOngId(@PathVariable Long id){
		return incidentService.getByOngId(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		incidentService.delete(id);
	}
}
