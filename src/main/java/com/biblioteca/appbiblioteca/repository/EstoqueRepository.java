package com.biblioteca.appbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.appbiblioteca.entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, String>{
	
}
