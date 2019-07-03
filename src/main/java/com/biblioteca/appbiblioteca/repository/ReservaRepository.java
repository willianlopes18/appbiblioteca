package com.biblioteca.appbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.appbiblioteca.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, String> {

}
