package com.example.doatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.doatech.models.Pes_Pessoa;

public interface PessoaRepository extends JpaRepository<Pes_Pessoa, Integer>{

}
