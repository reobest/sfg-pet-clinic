package rayan.SpringFramework.sfg_pet_clinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello, World!");
        return "Hey Folks!";
    }
}
