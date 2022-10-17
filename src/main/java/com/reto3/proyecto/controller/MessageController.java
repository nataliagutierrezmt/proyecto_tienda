package com.reto3.proyecto.controller;

import com.reto3.proyecto.model.Message;
import com.reto3.proyecto.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin (origins = "*")

public class MessageController {

    @Autowired
    private MessageService service;

    public MessageController() {

        //Constructor vacío
    }

    @GetMapping("/all")
    public List<Message> list() {return (List<Message>) service.findAll(); }

    @PostMapping("/save")
    public Message add(@RequestBody Message category) {return service.save(category); }

    @GetMapping("/{id}")
    public ResponseEntity<Message> get(@PathVariable Integer id) {
        try {
            Message category = service.findById(id).get();
            return new ResponseEntity<Message>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Message>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{update}")
    public Message update(@RequestBody Message category) {

        return service.save(category);
        }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
