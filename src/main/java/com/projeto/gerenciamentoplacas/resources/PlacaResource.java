package com.projeto.gerenciamentoplacas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.gerenciamentoplacas.domain.Placa;
import com.projeto.gerenciamentoplacas.services.PlacaService;

@RestController
@RequestMapping(value="/placas")
public class PlacaResource {
	
	@Autowired
	private PlacaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Placa obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}