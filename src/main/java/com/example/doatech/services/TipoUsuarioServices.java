package com.example.doatech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.models.TipoUsuario;
import com.example.doatech.repository.AquisicaoRepository;
import com.example.doatech.repository.PessoaRepository;
import com.example.doatech.repository.TipoUsuarioRepository;

@Service
public class TipoUsuarioServices {
	
	@Autowired
	TipoUsuarioRepository repository;
	
	public ArrayList<TipoUsuario> findAll() {
		ArrayList<TipoUsuario> List = new ArrayList<TipoUsuario>();
		List = (ArrayList<TipoUsuario>) repository.findAll();
		return List;
	}

	public TipoUsuario save(TipoUsuario pessoa) {
		return repository.save(pessoa);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
