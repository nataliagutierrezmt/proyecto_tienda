package com.reto3.proyecto.service;

import com.reto3.proyecto.model.Admin;
import com.reto3.proyecto.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public <S extends Admin> S save(S entity) {
        return adminRepository.save(entity);
    }

    public AdminService() {

        //Constructor vacío
    }

    public <S extends Admin> Iterable<S> saveAll(Iterable<S> entities) {
        return adminRepository.saveAll(entities);
    }

    public Optional<Admin> findById(Integer integer) {
        return adminRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return adminRepository.existsById(integer);
    }

    public Iterable<Admin> findAll() {
        return adminRepository.findAll();
    }

    public Iterable<Admin> findAllById(Iterable<Integer> integers) {
        return adminRepository.findAllById(integers);
    }

    public long count() {
        return adminRepository.count();
    }

    public void deleteById(Integer integer) {
        adminRepository.deleteById(integer);
    }

    public void delete(Admin entity) {
        adminRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        adminRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Admin> entities) {
        adminRepository.deleteAll(entities);
    }

    public void deleteAll() {
        adminRepository.deleteAll();
    }

}
