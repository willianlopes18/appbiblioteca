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

import com.biblioteca.appbiblioteca.entity.Usuario;
import com.biblioteca.appbiblioteca.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuariosResource {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Usuario> listaUsuarios() {
		Iterable<Usuario> listaUsuarios = repository.findAll();
		return listaUsuarios;
	}
	
	@PostMapping(value = "/login")
	public @ResponseBody Usuario autentica(@RequestBody Usuario usuario) {
		Usuario registerUser = repository.findByEmail(usuario.getEmail());
		
		if(		usuario.getEmail() == registerUser.getEmail() &&
				usuario.getSenha() == registerUser.getSenha()) {
			
			return registerUser;
		}else {
			return usuario;
		}
	}
	
	@PostMapping()
	public Usuario cadastraUsuario(@RequestBody @Valid Usuario usuario) {
		return repository.save(usuario);
	}
	
	@DeleteMapping()
	public Usuario deletaUsuario(@RequestBody Usuario usuario) {
		repository.delete(usuario);
		return usuario;
	}

}
