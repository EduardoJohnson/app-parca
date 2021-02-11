package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.User;
import com.example.project.repository.UserRepository;

@Service
public class UserService {


	@Autowired
	private UserRepository repo;

	public UserService(UserRepository userRepository){
		this.repo = userRepository;
	}

	public void salvar(Long cpf, String name, String email){
		repo.save(new User(cpf,name,email));
	}

	public List<User> listUser(){
		return repo.findAll();
	}
	
	public Optional<User> update(Long cpf,String name,String email){
		return repo.findById(cpf);
	}
	
	public void delete(Long cpf) {
		 repo.deleteById(cpf);
	}
	

}