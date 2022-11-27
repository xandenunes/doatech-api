package com.example.doatech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Doacao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.repository.AquisicaoRepository;
import com.example.doatech.repository.DoacaoRepository;
import com.example.doatech.repository.PessoaRepository;

@Service
public class DoacaoServices {
	
	@Autowired
	DoacaoRepository repository;
	
	public ArrayList<Doacao> findAll() {
		ArrayList<Doacao> List = new ArrayList<Doacao>();
		List = (ArrayList<Doacao>) repository.findAll();
		return List;
	}

	public Doacao save(Doacao pessoa) {
		return repository.save(pessoa);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
