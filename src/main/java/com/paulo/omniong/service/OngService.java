package com.paulo.omniong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.paulo.omniong.model.Ong;
import com.paulo.omniong.repository.OngRepository;

@Service
public class OngService {

	@Autowired private OngRepository ongRepository;
	
	public List<Ong> listar(){
		return ongRepository.findAll();
	}

	public Ong salvar(Ong ong) {
		return ongRepository.save(ong);
	}

	public Ong buscarPorId(Long id) {
		return ongRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
}
