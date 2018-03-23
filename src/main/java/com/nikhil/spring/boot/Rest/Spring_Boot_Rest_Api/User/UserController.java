package com.nikhil.spring.boot.Rest.Spring_Boot_Rest_Api.User;

import java.net.URI;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;


@RestController
public class UserController {
	
	@Autowired
	private UserComponent obj;
	
	@GetMapping(path="/users")
	public List<User> getUser(){
		return (List<User>)obj.getAll();
	}
	
	@GetMapping(path="/users/{id}")
	public User findone( @PathVariable("id") int id) {
		User user = obj.findOne(id);
		if(user == null) {
				throw new UserNotFoundException("id-"+id);
		}
		return user;
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		 User obj1 = obj.save(user);
		 URI location=ServletUriComponentsBuilder
		 .fromCurrentRequest()
		 .path("/{id}")
		 .buildAndExpand(obj1.getId()).toUri();
		 
		 return ResponseEntity.created(location).build();
	}
}
