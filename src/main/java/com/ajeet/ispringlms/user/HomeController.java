package com.ajeet.ispringlms.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Ye batata hai ki ye class HTTP requests handle karegi.

@RestController

// Is class ke saare endpoints /api se start honge.
@RequestMapping("/api")
public class HomeController {

    //Browser ya frontend jab GET request bhejega tab ye method chalega.
    @GetMapping
    public String home() {
        return "LearnSphere Backend Running 🚀";
    }

}

//Ab object Spring banayega.
//Yahi hai Inversion of Control (IoC).
//Jo object Spring IoC Container create aur manage karta hai, usse Bean kehte hain.
//IoC = Object creation ka control Spring ke paas.
//DI = Spring us object ko uski required dependencies de deta hai.