package com.example.project.map;

import org.springframework.stereotype.Component;

import com.example.project.domain.User;
import com.example.project.dto.UserDto;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Component
public class UserMap {
	
	private MapperFacade facade;
	private MapperFactory factory;
	
	
	public UserMap() {
		factory = new DefaultMapperFactory.Builder().build();
		factory.classMap(User.class,UserDto.class).byDefault().register();
		facade = factory.getMapperFacade();
	}
	public User dtoToEntity(UserDto userDto) {
		return facade.map(userDto, User.class);
		
	}
	public UserDto entityToDto(User user) {
		return facade.map(user, UserDto.class);
	}

}
