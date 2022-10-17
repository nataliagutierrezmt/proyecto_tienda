package com.reto3.proyecto.model;

import javax.persistence.*;

@Entity

public class Skate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String brand;
    @Column(length = 4)
    private Integer year;
    @Column(length = 250)
    private String description;

    public Skate() {

        //Constructor vacío
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public Integer getYear() {return year;}

    public void setYear(Integer year) {this.year = year;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

}
