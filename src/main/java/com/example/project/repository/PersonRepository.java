package com.example.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.project.domain.Person;

@RepositoryRestResource(collectionResourceRel = "personModel", path = "personModel")
public interface PersonRepository extends MongoRepository<Person, Long>{
	
}