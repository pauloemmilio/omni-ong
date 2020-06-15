package com.paulo.omniong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.omniong.model.Incident;
import com.paulo.omniong.repository.IncidentRepository;

@Service
public class IncidentService {

	@Autowired private IncidentRepository incidentRepository;

	public List<Incident> getByOngId(Long id) {
		return incidentRepository.findByOngId(id);
	}

	public Incident salvar(Incident incident) {
		return incidentRepository.save(incident);
	}

	public void delete(Long id) {
		incidentRepository.deleteById(id);
	}
}
