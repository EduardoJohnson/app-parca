package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.project.domain.Person;
import com.example.project.repository.PersonRepository;

@Service
public class PersonService {


	@Autowired
	private PersonRepository repo;

	public PersonService(PersonRepository personRepository){
		this.repo = personRepository;
	}

	public void salvar(Long id, String nome, String postagem){
		repo.save(new Person(id,nome,postagem));
	}

	public List<Person> listPerson(){
		return repo.findAll();
	}
	

}