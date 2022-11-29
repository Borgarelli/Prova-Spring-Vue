package br.gov.sp.fatec.projetolabiv.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {
    
    @GetMapping
    public String hello() {
        return "Hello!";
    }

}
