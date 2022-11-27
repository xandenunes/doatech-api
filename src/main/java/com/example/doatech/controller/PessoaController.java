package com.example.doatech.controller;

import java.util.ArrayList;

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
import com.example.doatech.services.PessoaServices;



@RestController
@CrossOrigin
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaServices services;

	@GetMapping
	public ArrayList<Pessoa> Todos(){
		return services.findAll();
	}
	@PostMapping("/criar")
	public Pessoa create(@RequestBody Pessoa pessoa) {
		return services.save(pessoa);
	}
	
	@GetMapping("/{publicacao}")
	public ArrayList<Pessoa> get(@PathVariable Integer publicacao){ 
		return services.get(publicacao);
	}
	@DeleteMapping("/delete/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		services.delete(id);
	}
}
