package com.example.proiectAplWebJava.repository;

import com.example.proiectAplWebJava.model.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, Integer> {

    @Query(value = "select * from producer p where p.producer_name = :name", nativeQuery = true)
    Producer findProducerByNameWithNativeQery(String name);

}
