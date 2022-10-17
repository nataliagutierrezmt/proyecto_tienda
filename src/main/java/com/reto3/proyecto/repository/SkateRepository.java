package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Skate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class SkateRepository {

    @Autowired
    private SkateRepositoryInterface SkateRepositoryInterface;

    public SkateRepository() {
        //Constructor vacío
    }

    public <S extends Skate> S save(S entity) {
        return SkateRepositoryInterface.save(entity);
    }

    public <S extends Skate> Iterable<S> saveAll(Iterable<S> entities) {
        return SkateRepositoryInterface.saveAll(entities);
    }

    public Optional<Skate> findById(Integer integer) {
        return SkateRepositoryInterface.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return SkateRepositoryInterface.existsById(integer);
    }

    public Iterable<Skate> findAll() {
        return SkateRepositoryInterface.findAll();
    }

    public Iterable<Skate> findAllById(Iterable<Integer> integers) {
        return SkateRepositoryInterface.findAllById(integers);
    }

    public long count() {
        return SkateRepositoryInterface.count();
    }

    public void deleteById(Integer integer) {
        SkateRepositoryInterface.deleteById(integer);
    }

    public void delete(Skate entity) {
        SkateRepositoryInterface.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        SkateRepositoryInterface.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Skate> entities) {
        SkateRepositoryInterface.deleteAll(entities);
    }

    public void deleteAll() {
        SkateRepositoryInterface.deleteAll();
    }


}
