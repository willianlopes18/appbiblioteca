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

import com.biblioteca.appbiblioteca.entity.Reserva;
import com.biblioteca.appbiblioteca.repository.ReservaRepository;

@RestController
@RequestMapping("/reserva")
public class ReservasResource {

	@Autowired
	private ReservaRepository repository;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Reserva> listaReservas() {
		Iterable<Reserva> listaReservas = repository.findAll();
		return listaReservas;
	}
	
	@PostMapping()
	public Reserva cadastraReserva(@RequestBody @Valid Reserva reserva) {
		return repository.save(reserva);
	}
	
	@DeleteMapping()
	public Reserva deletaReserva(@RequestBody Reserva reserva) {
		repository.delete(reserva);
		return reserva;
	}
	
}
