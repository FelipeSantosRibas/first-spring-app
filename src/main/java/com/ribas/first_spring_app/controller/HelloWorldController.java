package com.ribas.first_spring_app.controller;

import com.ribas.first_spring_app.domain.User;
import com.ribas.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController // @Controller + @ResponseBody
//STATELESS: token a cada solicitação | STATEFULL: login só uma vez
@RequestMapping("/hello-world") // Escuta todas as requisições que chegarem no endpoint /hello-world
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;
    //public HelloWorldController(HelloWorldService helloWorldService){
    //    this.helloWorldService = helloWorldService;
    //}


    // Métodos HTTP: post, get, delete, put, patch, options, head
    @GetMapping // Responde as requisições get no endpoint /hello-world
    public String helloWorld(){
        return helloWorldService.helloWorld("Felipe");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "null") String filter, @RequestBody User body){
        return "Nome: " + body.getName() + "\n Id: " + id + "\n Filter: " + filter;
    }
}
