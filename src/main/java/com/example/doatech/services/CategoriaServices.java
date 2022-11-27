package com.example.doatech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Categoria;
import com.example.doatech.models.Pessoa;
import com.example.doatech.repository.AquisicaoRepository;
import com.example.doatech.repository.CategoriaRepository;
import com.example.doatech.repository.PessoaRepository;

@Service
public class CategoriaServices {
	
	@Autowired
	CategoriaRepository repository;
	
	public ArrayList<Categoria> findAll() {
		ArrayList<Categoria> List = new ArrayList<Categoria>();
		List = (ArrayList<Categoria>) repository.findAll();
		return List;
	}

	public Categoria save(Categoria pessoa) {
		return repository.save(pessoa);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
