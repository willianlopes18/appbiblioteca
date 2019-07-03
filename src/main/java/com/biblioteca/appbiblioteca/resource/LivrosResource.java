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

import com.biblioteca.appbiblioteca.entity.Livro;
import com.biblioteca.appbiblioteca.repository.LivroRepository;;

@RestController
@RequestMapping("/livro")
public class LivrosResource {
	
	@Autowired
	private LivroRepository repository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Livro> listaLivros() {
		Iterable<Livro> listaLivros = repository.findAll();
		return listaLivros;
	}
	
	@PostMapping()
	public Livro cadastraLivro(@RequestBody @Valid Livro livro) {
		return repository.save(livro);
	}
	
	@DeleteMapping()
	public Livro deletaLivro(@RequestBody Livro livro) {
		repository.delete(livro);
		return livro;
	}

}
