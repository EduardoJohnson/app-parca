package com.example.project.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Document(collection = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long cpf;
	private String name;
	private String email;

	public User() {

	}

	public User(Long cpf, String name, String post) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.email = post;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}


