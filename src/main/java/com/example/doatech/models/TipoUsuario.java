package com.example.doatech.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="TPU_TIPO_USUARIO")
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tpu_id_tipo_usuario;
	
	@Column(name = "tpu_ds_descricao")
	private String descricao;

	public Integer getTpu_id_tipo_usuario() {
		return tpu_id_tipo_usuario;
	}

	public void setTpu_id_tipo_usuario(Integer tpu_id_tipo_usuario) {
		this.tpu_id_tipo_usuario = tpu_id_tipo_usuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
