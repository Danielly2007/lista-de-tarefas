package com.todo.list.dto;

import com.todo.list.entities.Usuario;

import jakarta.persistence.Column;

public class UsuarioDTO {
	
	private Long id;
	private String nome;
	private String email;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public UsuarioDTO(Usuario entity) { //recebe o valor da minha entidade
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail(); //faz os dois esta no mesmo nome, se tem um nome danielly em um, aqui tbm vai ser
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
