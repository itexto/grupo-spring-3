package br.devall.com.br.todo.controllers.dto;

import br.devall.com.br.todo.domain.Tarefa;

public class TarefaDTO {
	
	private String uuid;
	
	private Boolean done;
	
	private String name;
	
	public TarefaDTO() {
		// construtor padrão
	}
	
	public TarefaDTO(Tarefa tarefa) {
		this.uuid = tarefa.getUuid();
		this.done = tarefa.isPronto();
		this.name = tarefa.getTitulo();
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

}
