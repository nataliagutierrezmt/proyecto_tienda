package com.reto3.proyecto.controller;

import com.reto3.proyecto.model.Admin;
import com.reto3.proyecto.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin (origins = "*")

public class AdminController {

    @Autowired
    private AdminService service;

    public AdminController() {

        //Constructor vacío
    }

    @GetMapping("/all")
    public List<Admin> list() {return (List<Admin>) service.findAll(); }

    @PostMapping("/save")
    public Admin add(@RequestBody Admin category) {return service.save(category); }

    @GetMapping("/{id}")
    public ResponseEntity<Admin> get(@PathVariable Integer id) {
        try {
            Admin category = service.findById(id).get();
            return new ResponseEntity<Admin>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{update}")
    public Admin update(@RequestBody Admin category) {

        return service.save(category);
        }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
