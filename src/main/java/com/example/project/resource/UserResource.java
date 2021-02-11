package com.example.project.resource;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.project.domain.User;
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
	public String save(@RequestParam(value = "cpf") Long cpf, @RequestParam(value = "name") String name,
			@RequestParam(value = "email") String email) {

		service.salvar(cpf, name, email);

		return "Usuário criado com sucesso";
	}
	
	@PutMapping("/person/{cpf}")
		public Optional<User> update(@PathVariable(value="cpf") Long cpf,@RequestParam(value="name") String name) {
			return service.update(cpf,name);
			
	}

	@DeleteMapping("/person/{cpf}")
		public void delete(@PathVariable(value="cpf" )Long cpf) {
			service.delete(cpf);
			
			
		
	}


}

