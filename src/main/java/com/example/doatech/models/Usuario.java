package com.example.doatech.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="USR_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer usr_id_usuario;
	
	@Column(name = "usr_nm_login")
	private String login;
	
	@Column(name = "usr_nm_password")
	private String password;
	
	@Column(name = "usr_nm_email")
	private String email;

	@OneToOne
	@JoinColumn(name="pes_id_pessoa")
	private Pessoa pessoa;
	
	@OneToOne
	@JoinColumn(name="tpu_id_tipo_usuario")
	private TipoUsuario tipousuario;

	public Integer getUsr_id_usuario() {
		return usr_id_usuario;
	}

	public void setUsr_id_usuario(Integer usr_id_usuario) {
		this.usr_id_usuario = usr_id_usuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public TipoUsuario getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(TipoUsuario tipousuario) {
		this.tipousuario = tipousuario;
	}
	
	
}
