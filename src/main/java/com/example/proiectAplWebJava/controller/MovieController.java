package com.example.proiectAplWebJava.controller;


import com.example.proiectAplWebJava.dto.MovieTopDTO;
import com.example.proiectAplWebJava.model.Movie;
import com.example.proiectAplWebJava.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movie")

public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping("/new")
    public ResponseEntity<Movie> saveMovie(@RequestBody @Valid Movie movie) {
        return ResponseEntity.ok()
                .body(movieService.save(movie));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Movie>> retrieveMovies() {
        return ResponseEntity.ok().body(movieService.getAll());
    }

    @GetMapping("/getTop3")
    public ResponseEntity<List<MovieTopDTO>> retrieveTop3Movies(){
        return ResponseEntity.ok().body(movieService.getTop3Movies());
    }
}


