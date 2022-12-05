package com.example.doatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("SELECT u FROM USR_USUARIO u WHERE u.login = ?1 AND u.password=?2")
	Usuario login(String login,String senha); 
}
