package com.example.doatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.doatech.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
