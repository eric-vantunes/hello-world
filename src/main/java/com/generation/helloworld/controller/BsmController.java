package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {
	
    @GetMapping
    public List<String> getBsm() {
        return Arrays.asList("Responsabilidade Pessoal", "Mentalidade de Crescimento", "Persistencia", "Comunicação", "Orientação ao Futuro", "Proatividade", "Trabalho em Equipe");
    }
}
