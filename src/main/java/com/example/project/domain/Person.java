package com.example.project.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Document(collection = "personModel")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String name;
	private String post;

	public Person() {

	}

	public Person(Long id, String name, String post) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}


