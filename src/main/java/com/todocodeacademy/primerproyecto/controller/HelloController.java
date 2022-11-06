package com.todocodeacademy.primerproyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hellow")
    public String hellow(){
        return "hellow World";
    }

    @GetMapping("/hello/{nombre}/{edad}/{profesion}")
    public String sayHello(@PathVariable String nombre,
                           @PathVariable int edad,
                           @PathVariable String profesion)
    {
        return "El nombre es: " + nombre + "\n" +
                "La edad es: " + edad + "\n" +
                "La profesion es: " + profesion;
    }

    @GetMapping("/hellow2")
    public String hellow2(){
        return "hellow World";
    }
}
