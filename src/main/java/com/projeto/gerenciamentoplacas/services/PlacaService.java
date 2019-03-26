//Serviço q/ oferece operações de consulta de categorias.
package com.projeto.gerenciamentoplacas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.gerenciamentoplacas.domain.Placa;
import com.projeto.gerenciamentoplacas.repositories.PlacaRepository;

@Service 
public class PlacaService {
	
	@Autowired
	private PlacaRepository repo;
	
	public Placa find(Integer id) {
		Optional<Placa> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
