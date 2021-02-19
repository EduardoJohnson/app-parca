package com.example.project.domain;

import java.io.Serializable;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String body;
	private User author;
	
	
	
	public Post() {

	}

	public Post(String id, String title, String body,User author) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}



	
}
