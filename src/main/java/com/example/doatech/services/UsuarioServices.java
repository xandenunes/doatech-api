package com.example.doatech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.models.Usuario;
import com.example.doatech.repository.AquisicaoRepository;
import com.example.doatech.repository.PessoaRepository;
import com.example.doatech.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	
	@Autowired
	UsuarioRepository repository;
	
	public ArrayList<Usuario> findAll() {
		ArrayList<Usuario> List = new ArrayList<Usuario>();
		List = (ArrayList<Usuario>) repository.findAll();
		return List;
	}
	
	public Usuario login(Usuario pessoa) {
		return repository.login(pessoa.getLogin(),pessoa.getPassword());
	}

	public Usuario save(Usuario pessoa) {
		return repository.save(pessoa);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
