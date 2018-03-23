package com.nikhil.spring.boot.Rest.Spring_Boot_Rest_Api.User;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {



	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
	