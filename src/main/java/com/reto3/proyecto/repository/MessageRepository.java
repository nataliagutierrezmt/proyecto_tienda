package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class MessageRepository {

    @Autowired
    private MessageRepositoryInterface MessageRepositoryInterface;

    public MessageRepository() {
        //Constructor vacío
    }

    public <S extends Message> S save(S entity) {
        return MessageRepositoryInterface.save(entity);
    }

    public <S extends Message> Iterable<S> saveAll(Iterable<S> entities) {
        return MessageRepositoryInterface.saveAll(entities);
    }

    public Optional<Message> findById(Integer integer) {
        return MessageRepositoryInterface.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return MessageRepositoryInterface.existsById(integer);
    }

    public Iterable<Message> findAll() {
        return MessageRepositoryInterface.findAll();
    }

    public Iterable<Message> findAllById(Iterable<Integer> integers) {
        return MessageRepositoryInterface.findAllById(integers);
    }

    public long count() {
        return MessageRepositoryInterface.count();
    }

    public void deleteById(Integer integer) {
        MessageRepositoryInterface.deleteById(integer);
    }

    public void delete(Message entity) {
        MessageRepositoryInterface.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        MessageRepositoryInterface.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Message> entities) {
        MessageRepositoryInterface.deleteAll(entities);
    }

    public void deleteAll() {
        MessageRepositoryInterface.deleteAll();
    }


}
