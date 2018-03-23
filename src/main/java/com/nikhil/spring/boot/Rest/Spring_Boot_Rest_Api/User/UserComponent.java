package com.nikhil.spring.boot.Rest.Spring_Boot_Rest_Api.User;



import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {
	List<User> list = new ArrayList<>(
			Arrays.asList(new User(1,"Nikhil","Football"),
			new User(2,"Mubina","Chatting"),
			new User(3,"Suresh","IAS")
			));
	//get all user
	public List<User> getAll(){
		return list;
	}
	//add new user
	public User save(User user){
		list.add(user);
		return user;
	}
	//get one user by id
	public User findOne(int id) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return list.get(i);
			}
		}
		return null;
	}

}
 