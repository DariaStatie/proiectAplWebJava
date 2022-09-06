package com.example.proiectAplWebJava.controller;

import com.example.proiectAplWebJava.model.Director;
import com.example.proiectAplWebJava.service.DirectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/director")

public class DirectorController {

    private final DirectorService directorService;
    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @PostMapping("/new")
    public ResponseEntity<Director> saveDirector(@RequestBody Director director){
        return ResponseEntity.ok().body(directorService.save(director));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Director>> retrieveDirectors(){
        return ResponseEntity.ok().body(directorService.getAll());
    }

    @GetMapping("/directorByName")
    public ResponseEntity<Director> retrieveByName(@RequestParam String directorName){
        return ResponseEntity.ok().body(directorService.retrieveByName(directorName));
    }
}
