package com.reto3.proyecto.repository;

import com.reto3.proyecto.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class ReservationRepository {

    @Autowired
    private ReservationRepositoryInterface ReservationRepositoryInterface;

    public ReservationRepository() {
        //Constructor vacío
    }

    public <S extends Reservation> S save(S entity) {
        return ReservationRepositoryInterface.save(entity);
    }

    public <S extends Reservation> Iterable<S> saveAll(Iterable<S> entities) {
        return ReservationRepositoryInterface.saveAll(entities);
    }

    public Optional<Reservation> findById(Integer integer) {
        return ReservationRepositoryInterface.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return ReservationRepositoryInterface.existsById(integer);
    }

    public Iterable<Reservation> findAll() {
        return ReservationRepositoryInterface.findAll();
    }

    public Iterable<Reservation> findAllById(Iterable<Integer> integers) {
        return ReservationRepositoryInterface.findAllById(integers);
    }

    public long count() {
        return ReservationRepositoryInterface.count();
    }

    public void deleteById(Integer integer) {
        ReservationRepositoryInterface.deleteById(integer);
    }

    public void delete(Reservation entity) {
        ReservationRepositoryInterface.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        ReservationRepositoryInterface.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Reservation> entities) {
        ReservationRepositoryInterface.deleteAll(entities);
    }

    public void deleteAll() {
        ReservationRepositoryInterface.deleteAll();
    }


}
