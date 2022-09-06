package com.example.proiectAplWebJava.service;

import com.example.proiectAplWebJava.model.Producer;
import com.example.proiectAplWebJava.repository.ProducerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService {

    private final ProducerRepository producerRepository;
    public ProducerService(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }
    public Producer save (Producer producer) {
        return producerRepository.save(producer);
    }
    public List<Producer> getAll(){
        return producerRepository.findAll();
    }
    public Producer retrieveByName(String name) {
        return producerRepository.findProducerByNameWithNativeQery(name);
    }
}
