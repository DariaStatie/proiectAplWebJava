package com.example.proiectAplWebJava.service;

import com.example.proiectAplWebJava.model.Viewer;
import com.example.proiectAplWebJava.repository.ViewerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewerService {
    private final ViewerRepository viewerRepository;

    public ViewerService(ViewerRepository viewerRepository) { this.viewerRepository = viewerRepository; }

    public Viewer save (Viewer viewer){
        return viewerRepository.save(viewer);
    }
    public List<Viewer> getAll() {
        return viewerRepository.findAll();
    }

}
