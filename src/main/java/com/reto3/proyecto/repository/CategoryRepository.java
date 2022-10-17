package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class CategoryRepository {

    @Autowired
    private CategoryRepositoryInterface categoryRepositoryInterface;

    public CategoryRepository() {
        //Constructor vacío
    }

    public <S extends Category> S save(S entity) {
        return categoryRepositoryInterface.save(entity);
    }

    public <S extends Category> Iterable<S> saveAll(Iterable<S> entities) {
        return categoryRepositoryInterface.saveAll(entities);
    }

    public Optional<Category> findById(Integer integer) {
        return categoryRepositoryInterface.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return categoryRepositoryInterface.existsById(integer);
    }

    public Iterable<Category> findAll() {
        return categoryRepositoryInterface.findAll();
    }

    public Iterable<Category> findAllById(Iterable<Integer> integers) {
        return categoryRepositoryInterface.findAllById(integers);
    }

    public long count() {
        return categoryRepositoryInterface.count();
    }

    public void deleteById(Integer integer) {
        categoryRepositoryInterface.deleteById(integer);
    }

    public void delete(Category entity) {
        categoryRepositoryInterface.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        categoryRepositoryInterface.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Category> entities) {
        categoryRepositoryInterface.deleteAll(entities);
    }

    public void deleteAll() {
        categoryRepositoryInterface.deleteAll();
    }


}
