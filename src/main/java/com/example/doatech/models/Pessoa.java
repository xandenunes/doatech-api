package com.example.doatech.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="PES_PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pes_id_pessoa;
	
	@Column(name = "pes_ds_endereco")
	private String endereco;
	
	@Column(name = "pes_ds_idade")
	private Integer idade;
	
	@Column(name = "pes_nm_nome")
	private String nome;
	
	@Column(name = "pes_nm_telefone")
	private String telefone;

	public Integer getPes_id_pessoa() {
		return pes_id_pessoa;
	}

	public void setPes_id_pessoa(Integer pes_id_pessoa) {
		this.pes_id_pessoa = pes_id_pessoa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	
}
