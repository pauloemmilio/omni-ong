package com.paulo.omniong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.omniong.model.Ong;
import com.paulo.omniong.service.OngService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/ongs")
public class OngController {

	@Autowired private OngService ongService;
	
	@GetMapping
	public List<Ong> listar(){
		return ongService.listar();
	}
	
	@PostMapping
	public Ong cadastrar(@RequestBody Ong ong) {
		return ongService.salvar(ong);
	}
	
	@PostMapping("/sessions")
	public Ong getOng(@RequestBody Ong ong) {
		return ongService.buscarPorId(ong.getId());
	}
	
}
