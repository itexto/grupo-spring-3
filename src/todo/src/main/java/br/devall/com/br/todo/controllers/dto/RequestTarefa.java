package br.devall.com.br.todo.controllers.dto;

import br.devall.com.br.todo.domain.Tarefa;

public class RequestTarefa {
	
	private boolean done;
	
	private String name;
	
	public Tarefa create() {
		Tarefa tarefa = new Tarefa();
		tarefa.setPronto(isDone());
		tarefa.setTitulo(getName());
		return tarefa;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
