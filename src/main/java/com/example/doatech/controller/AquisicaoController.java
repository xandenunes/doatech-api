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

import com.example.doatech.models.Aquisicao;
import com.example.doatech.models.Pessoa;
import com.example.doatech.services.AquisicaoServices;
import com.example.doatech.services.PessoaServices;



@RestController
@CrossOrigin
@RequestMapping("/aquisicao")
public class AquisicaoController {
	
	@Autowired
	AquisicaoServices services;

	@GetMapping
	public ArrayList<Aquisicao> Todos(){
		return services.findAll();
	}
	@PostMapping("/criar")
	public Aquisicao create(@RequestBody Aquisicao pessoa) {
		return services.save(pessoa);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		services.delete(id);
	}
}
