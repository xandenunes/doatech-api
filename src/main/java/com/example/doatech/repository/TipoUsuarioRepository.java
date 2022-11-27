package com.example.doatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.models.TipoUsuario;

public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer>{

}
