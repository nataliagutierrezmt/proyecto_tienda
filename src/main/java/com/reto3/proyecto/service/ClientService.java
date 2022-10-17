package com.reto3.proyecto.service;

import com.reto3.proyecto.model.Client;
import com.reto3.proyecto.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public <S extends Client> S save(S entity) {
        return clientRepository.save(entity);
    }

    public ClientService() {

        //Constructor vacío
    }

    public <S extends Client> Iterable<S> saveAll(Iterable<S> entities) {
        return clientRepository.saveAll(entities);
    }

    public Optional<Client> findById(Integer integer) {
        return clientRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return clientRepository.existsById(integer);
    }

    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    public Iterable<Client> findAllById(Iterable<Integer> integers) {
        return clientRepository.findAllById(integers);
    }

    public long count() {
        return clientRepository.count();
    }

    public void deleteById(Integer integer) {
        clientRepository.deleteById(integer);
    }

    public void delete(Client entity) {
        clientRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        clientRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Client> entities) {
        clientRepository.deleteAll(entities);
    }

    public void deleteAll() {
        clientRepository.deleteAll();
    }

}
