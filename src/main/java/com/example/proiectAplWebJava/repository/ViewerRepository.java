package com.example.proiectAplWebJava.repository;



import com.example.proiectAplWebJava.model.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface ViewerRepository extends JpaRepository<Viewer,Integer> {

}

