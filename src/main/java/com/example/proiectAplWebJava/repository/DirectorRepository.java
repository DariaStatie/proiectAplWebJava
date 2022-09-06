package com.example.proiectAplWebJava.repository;

import com.example.proiectAplWebJava.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {

    @Query(value = "select * from director d where d.director_name = :name", nativeQuery = true)
    Director findDirectorByNameWithNativeQuery(String name);

}
