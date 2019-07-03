package com.biblioteca.appbiblioteca.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.appbiblioteca.entity.Estoque;
import com.biblioteca.appbiblioteca.repository.EstoqueRepository;

@RestController
@RequestMapping("/estoque")
public class EstoqueResource {
	
	@Autowired
	private EstoqueRepository repository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Estoque> listaEstoques() {
		Iterable<Estoque> listaEstoque = repository.findAll();
		return listaEstoque;
	}
	
	@PostMapping()
	public Estoque incluiEstoque(@RequestBody @Valid Estoque estoque) {
		return repository.save(estoque);
	}
	
	@DeleteMapping()
	public Estoque deletaEstoque(@RequestBody Estoque estoque) {
		repository.delete(estoque);
		return estoque;
	}

}
