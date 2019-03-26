package com.projeto.gerenciamentoplacas.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Esta classe é um controlador rest que responde pelo endpoint /categorias.
@RestController
@RequestMapping(value="/placas")
public class PlacasResource {

	//Para ser uma função REST, tem que associá-la a algum dos verbos do http.
	@RequestMapping(method=RequestMethod.GET)//GET porque está obtendo dados.
	public String listar() {
		return "REST está funcionando!";
	}
}
