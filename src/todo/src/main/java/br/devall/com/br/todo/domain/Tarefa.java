package br.devall.com.br.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarefa")
public class Tarefa {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="titulo", length=128, unique=true, nullable=false)
	private String titulo;
	
	@Column(name="pronto", nullable=false)
	private boolean pronto;
	
	@Column(name="uuid", nullable=false, length=64, updatable=false)
	private String uuid;
	
	

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isPronto() {
		return pronto;
	}

	public void setPronto(boolean pronto) {
		this.pronto = pronto;
	}
	
}
