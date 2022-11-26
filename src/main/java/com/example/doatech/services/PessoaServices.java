package com.example.doatech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Pes_Pessoa;
import com.example.doatech.repository.PessoaRepository;

@Service
public class PessoaServices {
	
	@Autowired
	PessoaRepository repository;
	
	public ArrayList<Pes_Pessoa> findAll() {
		ArrayList<Pes_Pessoa> List = new ArrayList<Pes_Pessoa>();
		List = (ArrayList<Pes_Pessoa>) repository.findAll();
		return List;
	}

	public Pes_Pessoa save(Pes_Pessoa pessoa) {
		return repository.save(pessoa);
	}

	public ArrayList<Pes_Pessoa> get(Integer publicacao) {
		ArrayList<Pes_Pessoa> arrayRetorno = new ArrayList<Pes_Pessoa>();
		return arrayRetorno;
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
