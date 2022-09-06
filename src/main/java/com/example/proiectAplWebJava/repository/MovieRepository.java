package com.example.proiectAplWebJava.repository;

import com.example.proiectAplWebJava.dto.MovieTopDTO;
import com.example.proiectAplWebJava.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    @Query(value = "select m.movie_id AS movieId, m.title AS title from movie m inner join review r on m.movie_id = r.movie_id group by m.movie_id order by AVG(r.rating) DESC limit 3 ", nativeQuery = true )
    List<MovieTopDTO> findTopThreeMovies();
}
