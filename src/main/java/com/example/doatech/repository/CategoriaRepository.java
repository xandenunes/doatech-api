package com.example.doatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Categoria;
import com.example.doatech.models.Pessoa;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
