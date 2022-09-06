package com.example.proiectAplWebJava.service;

import com.example.proiectAplWebJava.model.Category;
import com.example.proiectAplWebJava.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) { this.categoryRepository = categoryRepository; }

    public Category save (Category category) { return categoryRepository.save(category);}

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category getById(int id) {return categoryRepository.getById(id);}
}
