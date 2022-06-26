package com.zensar.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/greet/{myname}")
	public String Hello(@PathVariable(name="myname") String name) {
		return "Hello "  + name + " welcome to REST service";
	}

}
