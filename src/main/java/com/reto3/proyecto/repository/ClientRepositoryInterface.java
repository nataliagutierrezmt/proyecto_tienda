package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepositoryInterface extends CrudRepository<Client, Integer>{
    
}
