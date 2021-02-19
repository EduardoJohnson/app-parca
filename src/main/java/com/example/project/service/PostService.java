package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.Post;
import com.example.project.repository.PostRepository;

@Service
public class PostService {
	


	@Autowired
	private PostRepository repo;

	public PostService(PostRepository postRepository){
		this.repo = postRepository;
	}

	public String save(Post post){
		repo.save(post);
		return "inserido com felicidade";
	}


}
