package com.biblioteca.appbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.appbiblioteca.entity.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, String> {

}
