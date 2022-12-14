package com.example.doatech.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.doatech.models.Pessoa;
import com.example.doatech.models.Produto;
import com.example.doatech.services.PessoaServices;
import com.example.doatech.services.ProdutoServices;



@RestController
@CrossOrigin
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoServices services;

	@GetMapping
	public ArrayList<Produto> Todos(){
		return services.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> pesquisar(@PathVariable("id") Integer id) {
		Optional<Produto> publicacao = services.get(id);
		return publicacao;
	}
	
	@PostMapping("/criar")
	public Produto create(@RequestBody Produto pessoa) {
		return services.save(pessoa);
	}
	

	@DeleteMapping("/delete/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		services.delete(id);
	}
}
