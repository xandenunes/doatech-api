package com.example.doatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Doacao;
import com.example.doatech.models.Pessoa;

public interface DoacaoRepository extends JpaRepository<Doacao, Integer>{

}
