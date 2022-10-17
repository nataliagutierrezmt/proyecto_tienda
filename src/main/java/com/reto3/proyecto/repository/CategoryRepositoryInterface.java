package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositoryInterface extends CrudRepository<Category, Integer>{
    
}
