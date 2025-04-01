package com.todo.list.dto;

import java.time.LocalDate;

import com.todo.list.entities.Tarefas;
import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.StatusDaTarefa;

public class TarefaDTO {
	
	private Long id;
	private String descricao;
	private StatusDaTarefa status;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro;
	private long idUsuaro;
	
	public TarefaDTO() {
	}

	public TarefaDTO(Long id, String descricao, StatusDaTarefa status, String setor,
			Prioridade prioridade, LocalDate dataCadastro, Long idUsuaro) {
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.idUsuaro = idUsuaro;
		
	}
	
	public TarefaDTO(Tarefas entity) {
		id = entity.getId();
		descricao = entity.getDescricao();
		status = entity.getStatus();
		setor = entity.getSetor();
		prioridade = entity.getPrioridade();
		dataCadastro = entity.getDataCadastro();
		idUsuaro = entity.getUsuario().getId();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusDaTarefa getStatus() {
		return status;
	}

	public void setStatus(StatusDaTarefa status) {
		this.status = status;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public long getIdUsuaro() {
		return idUsuaro;
	}

	public void setIdUsuaro(long idUsuaro) {
		this.idUsuaro = idUsuaro;
	}
	
	


	
}
