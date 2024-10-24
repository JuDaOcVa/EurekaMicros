package org.software.judaocva.microservicioprueba.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @GetMapping("/prueba/hola-mundo")
    public String holaMundo() {
        System.out.println("Entro endpoint hola-mundo");
        return "Hola Mundo";
    }
}
