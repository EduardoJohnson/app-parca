package com.example.project.service;

import java.util.List;

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
	
	public User update(Long cpf,String userName2,String userEmail2){
		User recuperar = repo.findById(cpf).get();
		
		String userName = userName2;
		String userEmail = userEmail2;
		
		recuperar.setName(userName);
		recuperar.setEmail(userEmail);
		 return recuperar;
	}
	
	public User getCpf(Long cpf) {
		return repo.findById(cpf).get();
		
	}
	
	public void delete(Long cpf) {
		 repo.deleteById(cpf);
	}
	

}