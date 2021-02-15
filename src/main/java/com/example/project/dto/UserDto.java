package com.example.project.dto;


import com.example.project.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
	
	private String id;
	private String name;
	private String email;
	
	
	public  UserDto teste(User user) {
	    return new UserDto(user.getId(), user.getName(), user.getEmail());

	}
	public UserDto() {
		
	}
	



	public UserDto(String id, String name, String email) {


		this.id = id;
		this.name = name;
		this.email = email;
	}







	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}
	
	
	
	
	

}