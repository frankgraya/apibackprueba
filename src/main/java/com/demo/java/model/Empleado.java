package com.demo.java.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "empleados")
public class Empleado{


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    private String nombre;
    private String apellido;
    private String email;
    private String image;
}
