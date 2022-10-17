package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepositoryInterface extends CrudRepository<Reservation, Integer>{
    
}
