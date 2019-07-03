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

import com.biblioteca.appbiblioteca.entity.Biblioteca;
import com.biblioteca.appbiblioteca.repository.BibliotecaRepository;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaResource {
	
	@Autowired
	private BibliotecaRepository repository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Biblioteca> listaBiblioteca() {
		Iterable<Biblioteca> listaBiblioteca = repository.findAll();
		return listaBiblioteca;
	}
	
	@GetMapping(value = "/teste")
	public @ResponseBody String teste(){
		return "ola";
	}
	
	@PostMapping()
	public Biblioteca cadastraBiblioteca(@RequestBody @Valid Biblioteca biblioteca) {
		return repository.save(biblioteca);
	}
	
	@DeleteMapping()
	public Biblioteca deletaBiblioteca(@RequestBody Biblioteca biblioteca) {
		repository.delete(biblioteca);
		return biblioteca;
	}

}
