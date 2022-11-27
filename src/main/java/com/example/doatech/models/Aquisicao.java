package com.example.doatech.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="AQU_AQUISICAO")
public class Aquisicao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aqu_id_aquisicao;
	
	@Column(name = "aqu_dt_data_aquisicao")
	private Date dataAquisicao;
	
	@OneToOne
	@JoinColumn(name="prd_id_produto")
	private Produto produto;
	
	@OneToOne
	@JoinColumn(name="usr_id_usuario")
	private Usuario usuario;

	public Integer getAqu_id_aquisicao() {
		return aqu_id_aquisicao;
	}

	public void setAqu_id_aquisicao(Integer aqu_id_aquisicao) {
		this.aqu_id_aquisicao = aqu_id_aquisicao;
	}

	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
