package com.example.project.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.domain.User;
import com.example.project.dto.UserDto;
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
	public User filter(@PathVariable(value = "id") String id, UserDto user) {
		
		return service.filterId(id,user);
	}

	@DeleteMapping("/person/{id}")
	public void delete(@PathVariable(value = "id") String id) {
		service.delete(id);

	}

}
