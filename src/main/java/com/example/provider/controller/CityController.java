package com.example.provider.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
