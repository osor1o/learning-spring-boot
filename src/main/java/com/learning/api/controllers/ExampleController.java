package com.learning.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/example")
public class ExampleController {
	@GetMapping(value = "/{name}")
	public String example(@PathVariable("name") String name) {
		return "Hi " + name;
	}
}
