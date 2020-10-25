package com.example.provider.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CityController {

          @GetMapping("/cities")
        ResponseEntity<List<String>> city() {
            return ResponseEntity
                    .status(200)
                    .body(Arrays.asList("Kandy", "Colombo"));

    }

        @GetMapping("/hello")
    public String sayHello(
            @RequestParam (value = "name",required = false) String name){
                String ret = null;
              if(name!=null && !name.isEmpty())
                ret= "Hello "+name;

        return ret;
        }

        @GetMapping("/login")
              public String login(
                      @RequestParam (value = "name",required = true) String name,
                      @RequestParam (value = "password",required = true) String password){

              if(name.equals("dharaka") && password.equals("123"))
                  return  "Hello " + name;
               else
                   return "invalid user";}
}
