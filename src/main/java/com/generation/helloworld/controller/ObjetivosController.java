package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public List<String> getObjetivos() {
	    return Arrays.asList("Aprender SpringBoot", "Aprender sobre HTTP", "Aprender sobre API RESTful");
	}
	
}
