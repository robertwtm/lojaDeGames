package org.generation.lojaDeGames.controler;

import org.generation.lojaDeGames.model.Categoria;
import org.generation.lojaDeGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")

public class ControlerCategoria {
	
	@Autowired
	private CategoriaRepository repository;
	
	
	@GetMapping ("/{id}")
	public ResponseEntity<Categoria> findByIdCategoria(@PathVariable Long id) 
	{		
		return repository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}

	



}
