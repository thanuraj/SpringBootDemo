package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping(value = "/")
	void ping() {
		System.out.println("Hey there!!!");
	}
}
