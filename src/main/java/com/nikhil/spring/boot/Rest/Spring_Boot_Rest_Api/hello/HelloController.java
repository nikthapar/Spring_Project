package com.nikhil.spring.boot.Rest.Spring_Boot_Rest_Api.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(path="/hello-world")
	public String sayHi() {
		return "Hello World";
	}
	@GetMapping(path="hello-world-bean")
	public HelloBean getBean() {
		return new HelloBean("Hello World I am New BEan");
	}
	@GetMapping(path="hello-world/path/{name}")
	public HelloBean getBeanVar(@PathVariable("name") String name) {
		return new HelloBean("Hello man/Women " +name);
	}

}
