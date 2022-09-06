package com.example.proiectAplWebJava.controller;

import com.example.proiectAplWebJava.model.Viewer;
import com.example.proiectAplWebJava.service.ViewerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viewer")
public class ViewerController {

    private final ViewerService viewerService;

    public ViewerController(ViewerService viewerService){
        this.viewerService = viewerService;
    }

    @PostMapping("/new")
    public ResponseEntity<Viewer> saveViewer(@RequestBody Viewer viewer){
        return ResponseEntity.ok()
                .body(viewerService.save(viewer));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Viewer>> retrieveViewers(){
        return ResponseEntity.ok().body(viewerService.getAll());
    }

}
