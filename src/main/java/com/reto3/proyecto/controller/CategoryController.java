package com.reto3.proyecto.controller;

import com.reto3.proyecto.model.Category;
import com.reto3.proyecto.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin (origins = "*")

public class CategoryController {

    @Autowired
    private CategoryService service;

    public CategoryController() {

        //Constructor vacío
    }

    @GetMapping("/all")
    public List<Category> list() {return (List<Category>) service.findAll(); }

    @PostMapping("/save")
    public Category add(@RequestBody Category category) {return service.save(category); }

    @GetMapping("/{id}")
    public ResponseEntity<Category> get(@PathVariable Integer id) {
        try {
            Category category = service.findById(id).get();
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{update}")
    public Category update(@RequestBody Category category) {

        return service.save(category);
        }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
