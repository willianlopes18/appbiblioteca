package com.biblioteca.appbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.appbiblioteca.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, String> {

}
