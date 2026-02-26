package br.com.fiap.Movies.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Data
public class Movie {
    private String title;
    private String description;
    private int rating;
    private String synopsis;
    private LocalDate releaseDate;
    private String duration;
    private String genero;

    public Movie(String title, String description, int rating, String synopsis, LocalDate releaseDate, String duration, String genero) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.synopsis = synopsis;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genero = genero;
    }
}
