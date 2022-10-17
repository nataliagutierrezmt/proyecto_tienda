package com.reto3.proyecto.service;

import com.reto3.proyecto.model.Category;
import com.reto3.proyecto.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public <S extends Category> S save(S entity) {
        return categoryRepository.save(entity);
    }

    public CategoryService() {

        //Constructor vacío
    }

    public <S extends Category> Iterable<S> saveAll(Iterable<S> entities) {
        return categoryRepository.saveAll(entities);
    }

    public Optional<Category> findById(Integer integer) {
        return categoryRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return categoryRepository.existsById(integer);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Iterable<Category> findAllById(Iterable<Integer> integers) {
        return categoryRepository.findAllById(integers);
    }

    public long count() {
        return categoryRepository.count();
    }

    public void deleteById(Integer integer) {
        categoryRepository.deleteById(integer);
    }

    public void delete(Category entity) {
        categoryRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        categoryRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Category> entities) {
        categoryRepository.deleteAll(entities);
    }

    public void deleteAll() {
        categoryRepository.deleteAll();
    }

}
