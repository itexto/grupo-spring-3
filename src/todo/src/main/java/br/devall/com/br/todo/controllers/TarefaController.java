package br.devall.com.br.todo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.devall.com.br.todo.controllers.dto.RequestTarefa;
import br.devall.com.br.todo.controllers.dto.TarefaDTO;
import br.devall.com.br.todo.domain.Tarefa;
import br.devall.com.br.todo.service.TarefaService;

@RestController
public class TarefaController {
	
	private TarefaService service;
	
	@Autowired
	public TarefaController(TarefaService service) {
		this.service = service;
	}
	
	@PostMapping("/task")
	public TarefaDTO criar(@RequestBody RequestTarefa request) {
		Tarefa resultado = service.persistir(request.create());
		return new TarefaDTO(resultado);
	}
	
	@GetMapping("/task")
	public List<TarefaDTO> listar(@RequestParam(name="pronto", required=false) Boolean pronto) {
		
		List<Tarefa> lista = pronto != null ? service.listByPronto(pronto) : service.list();
		List<TarefaDTO> result = new ArrayList<>();
		
		lista.stream().forEach(t -> result.add(new TarefaDTO(t)));
		
		return result;
	}
	
	

}
