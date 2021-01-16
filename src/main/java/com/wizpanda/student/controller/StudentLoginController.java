package com.wizpanda.student.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class StudentLoginController {

	public StudentLoginController() {
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@GetMapping(value = "/welcome.do")
	public String welcomeStudent() {
		return "student is crazy";

	}
}
