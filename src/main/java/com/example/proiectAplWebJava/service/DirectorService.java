package com.example.proiectAplWebJava.service;

import com.example.proiectAplWebJava.model.Director;
import com.example.proiectAplWebJava.repository.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    private final DirectorRepository directorRepository;
    public DirectorService (DirectorRepository directorRepository){
        this.directorRepository = directorRepository;
    }
    public Director save (Director director){
        return  directorRepository.save(director);
    }
    public List<Director> getAll(){
        return directorRepository.findAll();
    }
    public Director retrieveByName(String name){
        return directorRepository.findDirectorByNameWithNativeQuery(name);
    }
}
