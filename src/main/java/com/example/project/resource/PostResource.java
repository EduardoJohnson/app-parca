package com.example.project.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.domain.Post;
import com.example.project.service.PostService;

@RestController
@RequestMapping(value = "/users")
public class PostResource {
	
	@Autowired
	private PostService postService;
	
	@PostMapping("/post")
	public String save(@RequestBody Post post) {
		return postService.save(post);
		 
	
	}

}
