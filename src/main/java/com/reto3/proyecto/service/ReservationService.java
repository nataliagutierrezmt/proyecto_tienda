package com.reto3.proyecto.service;

import com.reto3.proyecto.model.Reservation;
import com.reto3.proyecto.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public <S extends Reservation> S save(S entity) {
        return reservationRepository.save(entity);
    }

    public ReservationService() {

        //Constructor vacío
    }

    public <S extends Reservation> Iterable<S> saveAll(Iterable<S> entities) {
        return reservationRepository.saveAll(entities);
    }

    public Optional<Reservation> findById(Integer integer) {
        return reservationRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return reservationRepository.existsById(integer);
    }

    public Iterable<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Iterable<Reservation> findAllById(Iterable<Integer> integers) {
        return reservationRepository.findAllById(integers);
    }

    public long count() {
        return reservationRepository.count();
    }

    public void deleteById(Integer integer) {
        reservationRepository.deleteById(integer);
    }

    public void delete(Reservation entity) {
        reservationRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        reservationRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Reservation> entities) {
        reservationRepository.deleteAll(entities);
    }

    public void deleteAll() {
        reservationRepository.deleteAll();
    }

}
