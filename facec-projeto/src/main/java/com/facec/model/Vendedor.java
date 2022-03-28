package com.facec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotBlank(message = "O nome do vendedor não pode ser branco")
    private String nome;
	@NotBlank(message = "O cpf do vendedor não pode ser branco")
    private String cpf;
	@NotBlank(message = "O telefone do vendedor não pode ser branco")
    private String telefone;
	@NotNull(message = "O telefone do vendedor não pode ser branco")
    private Status status;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
    
    
}
