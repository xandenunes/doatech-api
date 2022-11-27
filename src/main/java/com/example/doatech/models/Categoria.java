package com.example.doatech.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CAT_CATEGORIA")
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cat_id_categoria;
	
	@Column(name = "cat_ds_descricao")
	private String descricao;

	public Integer getCat_id_categoria() {
		return cat_id_categoria;
	}

	public void setCat_id_categoria(Integer cat_id_categoria) {
		this.cat_id_categoria = cat_id_categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
