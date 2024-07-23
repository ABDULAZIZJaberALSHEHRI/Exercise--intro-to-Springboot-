package com.example.exerciseintroductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String name(){
        return "Abdulaziz Jaber Alshehri.";
    }

    @GetMapping("/age")
    public String age(){
        return "My name is 25";
    }

    @GetMapping("/check/status")
    public String status(){
        return "Everything is ok.";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Abdulaziz");
        names.add("Jaber");
        names.add("Abdulmaged");
        names.add("Ali");
        names.add("Ismail");
        return names;
    }
}
