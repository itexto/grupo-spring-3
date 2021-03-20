package br.devall.com.br.todo.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.devall.com.br.todo.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
	List<Tarefa> findAllByPronto(Boolean pronto);
	
}
