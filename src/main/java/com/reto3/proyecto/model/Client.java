package com.reto3.proyecto.model;


import javax.persistence.*;

@Entity

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    @Column(length = 45)
    private String email;
    @Column(length = 250)
    private String password;
    @Column(length = 250)
    private String name;
    @Column
    private int age;

    public Client() {

        //Constructor vacío
    }

    public int getIdClient() {return idClient;}

    public void setIdClient(int idClient) {this.idClient = idClient;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

}