package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello-gretting/{name}")
	public String helloGretting(@PathVariable("name") String name) {
		return "Hello World!!! " + name;
	}
	
}
