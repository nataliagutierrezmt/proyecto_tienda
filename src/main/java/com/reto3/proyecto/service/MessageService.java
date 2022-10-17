package com.reto3.proyecto.service;

import com.reto3.proyecto.model.Message;
import com.reto3.proyecto.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public <S extends Message> S save(S entity) {
        return messageRepository.save(entity);
    }

    public MessageService() {

        //Constructor vacío
    }

    public <S extends Message> Iterable<S> saveAll(Iterable<S> entities) {
        return messageRepository.saveAll(entities);
    }

    public Optional<Message> findById(Integer integer) {
        return messageRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return messageRepository.existsById(integer);
    }

    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    public Iterable<Message> findAllById(Iterable<Integer> integers) {
        return messageRepository.findAllById(integers);
    }

    public long count() {
        return messageRepository.count();
    }

    public void deleteById(Integer integer) {
        messageRepository.deleteById(integer);
    }

    public void delete(Message entity) {
        messageRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        messageRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Message> entities) {
        messageRepository.deleteAll(entities);
    }

    public void deleteAll() {
        messageRepository.deleteAll();
    }

}
