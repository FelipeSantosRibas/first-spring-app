package com.ribas.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // @Controller + @ResponseBody
//STATELESS: token a cada solicitação | STATEFULL: login só uma vez
@RequestMapping("/hello-world") // Escuta todas as requisições que chegarem no endpoint /hello-world
public class HelloWorldController {
    // Métodos HTTP: post, get, delete, put, patch, options, head

    @GetMapping // Responde as requisições get no endpoint /hello-world
    public String helloWorld(){
        return "Hello World!";
    }
}
