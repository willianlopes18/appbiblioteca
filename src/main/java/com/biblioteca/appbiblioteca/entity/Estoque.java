package com.biblioteca.appbiblioteca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="estoque")
public class Estoque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long estoque_id;
	
	public long getEstoque_id() {
		return estoque_id;
	}

	public void setEstoque_id(long estoque_id) {
		this.estoque_id = estoque_id;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "biblioteca_id", nullable = false)
	private Biblioteca biblioteca;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "livro_id", nullable = false)
	private Livro livro;
	
	@Column(name = "quantidade")
	private int quantidade;

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
