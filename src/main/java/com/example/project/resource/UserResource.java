package com.example.project.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.project.domain.User;
import com.example.project.dto.UpdateUserRequestDto;
import com.example.project.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping("/person")
	public List<User> findAll() {
		return service.listUser();
	}

	@PostMapping("/person")
	public String save(@RequestBody User user) {
		return service.save(user);
		 
		

	
	}

	@PutMapping("/person/{id}")
	public User att(@PathVariable(value = "id")String id, @RequestBody UpdateUserRequestDto user) {
	
	return service.update(id,user);

	}

	@GetMapping("/person/{id}")
	public User filter(@PathVariable(value = "id") String id) {
		
		return service.filterId(id);
	}

	@DeleteMapping("/person/{id}")
	public void delete(@PathVariable(value = "id") String id) {
		service.delete(id);

	}

}
