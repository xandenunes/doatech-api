package com.example.doatech.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="PRD_PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer prd_id_produto;
	
	@Column(name = "prd_ds_descricao")
	private String descricao;
	
	@Column(name = "prd_ds_quantidade")
	private Integer quantidade;
	
	@Column(name = "prd_ds_preco")
	private Double preco;
	
	@OneToOne
	@JoinColumn(name="cat_id_categoria")
	private Categoria categoria;

	public Integer getPrd_id_produto() {
		return prd_id_produto;
	}

	public void setPrd_id_produto(Integer prd_id_produto) {
		this.prd_id_produto = prd_id_produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
