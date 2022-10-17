package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class AdminRepository {

    @Autowired
    private AdminRepositoryInterface AdminRepositoryInterface;

    public AdminRepository() {
        //Constructor vacío
    }

    public <S extends Admin> S save(S entity) {
        return AdminRepositoryInterface.save(entity);
    }

    public <S extends Admin> Iterable<S> saveAll(Iterable<S> entities) {
        return AdminRepositoryInterface.saveAll(entities);
    }

    public Optional<Admin> findById(Integer integer) {
        return AdminRepositoryInterface.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return AdminRepositoryInterface.existsById(integer);
    }

    public Iterable<Admin> findAll() {
        return AdminRepositoryInterface.findAll();
    }

    public Iterable<Admin> findAllById(Iterable<Integer> integers) {
        return AdminRepositoryInterface.findAllById(integers);
    }

    public long count() {
        return AdminRepositoryInterface.count();
    }

    public void deleteById(Integer integer) {
        AdminRepositoryInterface.deleteById(integer);
    }

    public void delete(Admin entity) {
        AdminRepositoryInterface.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        AdminRepositoryInterface.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Admin> entities) {
        AdminRepositoryInterface.deleteAll(entities);
    }

    public void deleteAll() {
        AdminRepositoryInterface.deleteAll();
    }


}
