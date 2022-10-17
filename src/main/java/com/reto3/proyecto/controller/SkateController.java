package com.reto3.proyecto.controller;

import com.reto3.proyecto.model.Skate;
import com.reto3.proyecto.service.SkateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/Skate")
@CrossOrigin (origins = "*")

public class SkateController {

    @Autowired
    private SkateService service;

    public SkateController() {

        //Constructor vacío
    }

    @GetMapping("/all")
    public List<Skate> list() {return (List<Skate>) service.findAll(); }

    @PostMapping("/save")
    public Skate add(@RequestBody Skate category) {return service.save(category); }

    @GetMapping("/{id}")
    public ResponseEntity<Skate> get(@PathVariable Integer id) {
        try {
            Skate category = service.findById(id).get();
            return new ResponseEntity<Skate>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Skate>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{update}")
    public Skate update(@RequestBody Skate category) {

        return service.save(category);
        }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
