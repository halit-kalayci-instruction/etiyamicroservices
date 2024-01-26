package com.etiya.orderservice.controllers;

import com.etiya.orderservice.entities.Category;
import com.etiya.orderservice.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoriesController {
    private final CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @PostMapping
    public void add(@RequestBody Category category)
    {
        categoryRepository.save(category);
    }
}
