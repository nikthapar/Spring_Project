package com.nikhil.spring.boot.Rest.Spring_Boot_Rest_Api.hello;

public class HelloBean {
	private String message;
	
    HelloBean(){
    	super();
    }
    HelloBean(String message){
    	this.message=message;
    }
    
	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
