package com.example.proiectAplWebJava.controller;

import com.example.proiectAplWebJava.model.Category;
import com.example.proiectAplWebJava.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")

public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService= categoryService;
    }

    @PostMapping("/new")
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        return ResponseEntity.ok()
                .body(categoryService.save(category));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Category>> retrieveCategories(){
        return ResponseEntity.ok().body(categoryService.getAll());
    }

    @PutMapping("/update")
    public ResponseEntity<Category> updateOrCreateCategory(@RequestBody Category category){
        return ResponseEntity.ok()
                .body(categoryService.save(category));
    }

}
