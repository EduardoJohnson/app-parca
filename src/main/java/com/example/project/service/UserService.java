package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.domain.User;
import com.example.project.repository.UserRepository;

@Service
public class UserService {


	@Autowired
	private UserRepository repo;

	public UserService(UserRepository userRepository){
		this.repo = userRepository;
	}

	public String save(User user){
	
		repo.save(user);
		return "inserido com felicidade";
	}

	public List<User> listUser(){
		return repo.findAll();
	}
	
	public User update(String id ,User user){
		Optional<User> recuperar = repo.findById(id);
		
		return repo.save(user);

		 	
		 }
	


	public User filterId(String id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(String id) {
		 repo.deleteById(id);
	}
	

}