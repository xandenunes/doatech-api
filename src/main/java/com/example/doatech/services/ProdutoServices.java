package com.example.doatech.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.models.Produto;
import com.example.doatech.repository.AquisicaoRepository;
import com.example.doatech.repository.PessoaRepository;
import com.example.doatech.repository.ProdutoRepository;

@Service
public class ProdutoServices {
	
	@Autowired
	ProdutoRepository repository;
	
	public ArrayList<Produto> findAll() {
		ArrayList<Produto> List = new ArrayList<Produto>();
		List = (ArrayList<Produto>) repository.findAll();
		return List;
	}

	public Produto save(Produto pessoa) {
		return repository.save(pessoa);
	}
	
	public Optional<Produto> get(Integer id) {
		Optional<Produto> publicacao = repository.findById(id);
		return publicacao;
		
		
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
