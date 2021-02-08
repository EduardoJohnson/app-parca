package com.example.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.project.domain.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Long>{
	
}