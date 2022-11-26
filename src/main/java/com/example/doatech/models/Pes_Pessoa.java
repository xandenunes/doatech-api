package com.example.doatech.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="PES_PESSOA")
public class Pes_Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pes_id_pessoa;
	
	@Column(name = "pes_ds_endereco")
	private String endereco;
	
	@Column(name = "pes_ds_idade")
	private Integer idade;
	
	@Column(name = "pes_nm_nome")
	private String nome;

}
