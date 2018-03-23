package com.nikhil.spring.boot.Rest.Spring_Boot_Rest_Api.User;

public class User {
   private int id;
   private String name;
   private String hobbies;
   
   
   protected User() {
	   super();
   }
public User(int id, String name, String hobbies) {
	super();
	this.id = id;
	this.name = name;
	this.hobbies = hobbies;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
}
