package com.example.proiectAplWebJava.controller;

import com.example.proiectAplWebJava.model.Director;
import com.example.proiectAplWebJava.model.Producer;
import com.example.proiectAplWebJava.service.DirectorService;
import com.example.proiectAplWebJava.service.ProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producer")

public class ProducerController {
    private final ProducerService producerService;
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/new")
    public ResponseEntity<Producer> saveProducer(@RequestBody Producer producer){
        return ResponseEntity.ok().body(producerService.save(producer));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Producer>> retrieveProducers(){
        return ResponseEntity.ok().body(producerService.getAll());
    }

    @GetMapping("/producerByName")
    public ResponseEntity<Producer> retrieveByName(@RequestParam String producerName){
        return ResponseEntity.ok().body(producerService.retrieveByName(producerName));
    }
}
