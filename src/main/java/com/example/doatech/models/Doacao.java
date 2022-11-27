package com.example.doatech.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="DOA_DOACAO")
public class Doacao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer doa_id_doacao;
	
	@Column(name = "doa_dt_data_doacao")
	private Date dataDoacao;
	
	@OneToOne
	@JoinColumn(name="prd_id_produto")
	private Produto produto;
	
	@OneToOne
	@JoinColumn(name="usr_id_usuario")
	private Usuario usuario;

	public Integer getDoa_id_doacao() {
		return doa_id_doacao;
	}

	public void setDoa_id_doacao(Integer doa_id_doacao) {
		this.doa_id_doacao = doa_id_doacao;
	}

	public Date getDataDoacao() {
		return dataDoacao;
	}

	public void setDataDoacao(Date dataDoacao) {
		this.dataDoacao = dataDoacao;
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
