package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.project.domain.Person;
import com.example.project.repository.PersonRepository;

@Service
public class PersonService {
	
	
	public PersonService(Repository repository){

		this.repo = repo;

		}
	@Autowired
	private PersonRepository repo;
	
	public List<Person> findAll(){
		return repo.findAll();
		
	}
	
	

}