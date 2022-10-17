package com.reto3.proyecto.controller;

import com.reto3.proyecto.model.Reservation;
import com.reto3.proyecto.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin (origins = "*")

public class ReservationController {

    @Autowired
    private ReservationService service;

    public ReservationController() {

        //Constructor vacío
    }

    @GetMapping("/all")
    public List<Reservation> list() {return (List<Reservation>) service.findAll(); }

    @PostMapping("/save")
    public Reservation add(@RequestBody Reservation category) {return service.save(category); }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> get(@PathVariable Integer id) {
        try {
            Reservation category = service.findById(id).get();
            return new ResponseEntity<Reservation>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Reservation>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{update}")
    public Reservation update(@RequestBody Reservation category) {

        return service.save(category);
        }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
