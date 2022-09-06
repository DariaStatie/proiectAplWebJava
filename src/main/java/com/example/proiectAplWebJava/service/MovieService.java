package com.example.proiectAplWebJava.service;

import com.example.proiectAplWebJava.dto.MovieTopDTO;
import com.example.proiectAplWebJava.model.Movie;

import com.example.proiectAplWebJava.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) { this.movieRepository = movieRepository; }

    public Movie save (Movie movie) {return movieRepository.save(movie);}

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public List<MovieTopDTO> getTop3Movies () {
        System.out.println(movieRepository.findTopThreeMovies());
        return movieRepository.findTopThreeMovies();}
}
