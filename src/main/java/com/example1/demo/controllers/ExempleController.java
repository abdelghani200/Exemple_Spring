package com.example1.demo.controllers;


import com.example1.demo.services.ExempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExempleController {

    @Autowired
    private ExempleService exempleService;


    @GetMapping("/youcode")
    public String printMessage()
    {
        return exempleService.printName("sun 95");
    }







}
