package com.facec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotBlank(message = "O nome do cliente não pode ficar em branco")
    private String nome;
	@NotBlank(message = "O cpf do cliente não pode ficar em branco")
	@CPF(message = "CPF Invalido!")
    private String cpf;
	@NotBlank(message = "O telefone do cliente não pode ficar em branco")
    private String telefone;
	@NotNull(message = "O telefone do vendedor não pode ser branco")
    private Status status;
	@NotBlank(message = "O endereco do cliente não pode ficar em branco")
    private String endereco;
	
	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    
}
