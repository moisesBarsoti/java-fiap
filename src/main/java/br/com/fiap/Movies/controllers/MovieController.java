package br.com.fiap.Movies.controllers;

import br.com.fiap.Movies.models.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@Slf4j
public class MovieController {

    record HealthStatus(String status, String message){

    }

    @GetMapping("/")
    public String healthCheck() {
        return """
                {
                    "status" : "ok",
                    "message" : "API is running"
                }
                """;
    }

    @GetMapping("/movies")
    public List<Movie> listAll() {
        return List.of(
            new Movie(
                "Titanic",
                "Todos morrem no final",
                5,
                "teste",
                LocalDate.of(1997, 12, 01),
                "2h30",
                "Romance"
        ));
    }

    @PostMapping("/movies")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Movie CreateMovie(@RequestBody Movie movie) {
        System.out.println("Cadastrando filme..." + movie);
        return movie;
    }
}
