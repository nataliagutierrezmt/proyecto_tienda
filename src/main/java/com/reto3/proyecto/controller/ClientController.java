package com.reto3.proyecto.controller;

import com.reto3.proyecto.model.Client;
import com.reto3.proyecto.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin (origins = "*")

public class ClientController {

    @Autowired
    private ClientService service;

    public ClientController() {

        //Constructor vacío
    }

    @GetMapping("/all")
    public List<Client> list() {return (List<Client>) service.findAll(); }

    @PostMapping("/save")
    public Client add(@RequestBody Client category) {return service.save(category); }

    @GetMapping("/{id}")
    public ResponseEntity<Client> get(@PathVariable Integer id) {
        try {
            Client category = service.findById(id).get();
            return new ResponseEntity<Client>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{update}")
    public Client update(@RequestBody Client category) {

        return service.save(category);
        }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
