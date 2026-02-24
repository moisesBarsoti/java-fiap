package br.com.fiap.Movies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/")
    public String healthCheck() {
        return """
                {
                    "status" : "ok",
                    "message" : "API is running"
                }
                """;
    }
}
