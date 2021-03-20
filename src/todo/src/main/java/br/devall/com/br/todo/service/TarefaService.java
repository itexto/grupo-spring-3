package br.devall.com.br.todo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.devall.com.br.todo.domain.Tarefa;
import br.devall.com.br.todo.respositories.TarefaRepository;

@Component
public class TarefaService {
	
	private final TarefaRepository tarefaRepository;
	
	@Autowired
	public TarefaService(TarefaRepository repo) {
		this.tarefaRepository = repo;
	}
	
	public List<Tarefa> list() {
		return this.tarefaRepository.findAll();
	}
	
	public Tarefa persistir(Tarefa tarefa) {
		if (tarefa.getUuid() == null) {
			tarefa.setUuid(UUID.randomUUID().toString());
		}
		Tarefa result = tarefaRepository.save(tarefa);
		return result;
	}
	
	public List<Tarefa> listByPronto(Boolean pronto) {
		return this.tarefaRepository.findAllByPronto(pronto);
	}
	
}
