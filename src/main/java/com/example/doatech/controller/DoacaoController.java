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

import com.example.doatech.models.Doacao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.services.DoacaoServices;
import com.example.doatech.services.PessoaServices;



@RestController
@CrossOrigin
@RequestMapping("/doacao")
public class DoacaoController {
	
	@Autowired
	DoacaoServices services;

	@GetMapping
	public ArrayList<Doacao> Todos(){
		return services.findAll();
	}
	@PostMapping("/criar")
	public Doacao create(@RequestBody Doacao pessoa) {
		return services.save(pessoa);
	}
	

	@DeleteMapping("/delete/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		services.delete(id);
	}
}
