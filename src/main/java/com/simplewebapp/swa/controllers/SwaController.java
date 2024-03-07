package com.simplewebapp.swa.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SwaController {

    @GetMapping("/")    
    public String swaContent(){
        return "<h1>Welcome to my Simple Spring Web App!</h1>";
    }

}
