package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class ClientRepository {

    @Autowired
    private ClientRepositoryInterface ClientRepositoryInterface;

    public ClientRepository() {
        //Constructor vacío
    }

    public <S extends Client> S save(S entity) {
        return ClientRepositoryInterface.save(entity);
    }

    public <S extends Client> Iterable<S> saveAll(Iterable<S> entities) {
        return ClientRepositoryInterface.saveAll(entities);
    }

    public Optional<Client> findById(Integer integer) {
        return ClientRepositoryInterface.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return ClientRepositoryInterface.existsById(integer);
    }

    public Iterable<Client> findAll() {
        return ClientRepositoryInterface.findAll();
    }

    public Iterable<Client> findAllById(Iterable<Integer> integers) {
        return ClientRepositoryInterface.findAllById(integers);
    }

    public long count() {
        return ClientRepositoryInterface.count();
    }

    public void deleteById(Integer integer) {
        ClientRepositoryInterface.deleteById(integer);
    }

    public void delete(Client entity) {
        ClientRepositoryInterface.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        ClientRepositoryInterface.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Client> entities) {
        ClientRepositoryInterface.deleteAll(entities);
    }

    public void deleteAll() {
        ClientRepositoryInterface.deleteAll();
    }


}
