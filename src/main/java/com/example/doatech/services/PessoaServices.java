package com.example.doatech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Pessoa;
import com.example.doatech.repository.PessoaRepository;

@Service
public class PessoaServices {
	
	@Autowired
	PessoaRepository repository;
	
	public ArrayList<Pessoa> findAll() {
		ArrayList<Pessoa> List = new ArrayList<Pessoa>();
		List = (ArrayList<Pessoa>) repository.findAll();
		return List;
	}

	public Pessoa save(Pessoa pessoa) {
		return repository.save(pessoa);
	}

	public ArrayList<Pessoa> get(Integer publicacao) {
		ArrayList<Pessoa> arrayRetorno = new ArrayList<Pessoa>();
		return arrayRetorno;
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
