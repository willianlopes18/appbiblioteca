package com.biblioteca.appbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.appbiblioteca.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	Usuario findByEmail(String email);
}
