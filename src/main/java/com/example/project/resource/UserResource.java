package com.example.project.resource;

import java.util.List;

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

	@PostMapping("/person/{cpf}/{name}/{email}")
	public String save(@PathVariable(value = "cpf") Long cpf, @PathVariable(value = "name") String name,

			@PathVariable(value = "email") String email) {

		service.salvar(cpf, name, email);

		return "Usuário criado com sucesso";
	}

	@PostMapping(name = "/person/{cpf}/{name}/{email}")
	public User update(@PathVariable(value = "cpf") Long cpf, @PathVariable(value = "name") String name,
			@PathVariable(value = "email") String email) {

		return service.update(cpf, name,email);

	}

	@GetMapping("/person/{cpf}")
	public User teste(@PathVariable(value = "cpf") Long cpf) {

		return service.getCpf(cpf);
	}

	@DeleteMapping("/person/{cpf}")
	public void delete(@PathVariable(value = "cpf") Long cpf) {
		service.delete(cpf);

	}

}
