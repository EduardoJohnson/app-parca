package com.example.project.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.project.domain.Person;
import com.example.project.service.PersonService;

@RestController
@RequestMapping(value = "/people")
public class PersonResource {

	@Autowired
	private PersonService service;

	@GetMapping("/all")
	public List<Person> findAll() {

		return service.listPerson();
	}

	@PostMapping("/all")
	public String save(@RequestParam(value = "id") Long id, @RequestParam(value = "nome") String nome, @RequestParam(value = "postagem") String postagem) {

		service.salvar(id, nome,postagem);

		return "Usuário criado com sucesso";
	}



}