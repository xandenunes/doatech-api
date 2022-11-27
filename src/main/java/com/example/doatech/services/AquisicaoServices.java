package com.example.doatech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.repository.AquisicaoRepository;
import com.example.doatech.repository.PessoaRepository;

@Service
public class AquisicaoServices {
	
	@Autowired
	AquisicaoRepository repository;
	
	public ArrayList<Aquisicao> findAll() {
		ArrayList<Aquisicao> List = new ArrayList<Aquisicao>();
		List = (ArrayList<Aquisicao>) repository.findAll();
		return List;
	}

	public Aquisicao save(Aquisicao pessoa) {
		return repository.save(pessoa);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
