package com.reto3.proyecto.model;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;
    @Column()
    private Date startDate;
    @Column
    private Date devolutionDate;
    @Column
    private String status = "created";

    public Reservation() {

        //Constructor vacío
    }

    public int getIdReservation() {return idReservation;}

    public void setIdReservation(int idReservation) {this.idReservation = idReservation;}

    public Date getStartDate() {return startDate;}

    public void setStartDate(Date startDate) {this.startDate = startDate;}

    public Date getDevolutionDate() {return devolutionDate;}

    public void setDevolutionDate(Date devolutionDate) {this.devolutionDate = devolutionDate;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

}
