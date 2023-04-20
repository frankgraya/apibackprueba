package com.demo.java.model;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "humano")
public class Humano {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    private String ubication;
    private String position;
    private String fullname;
    private String image;
    private String usuario;
    private String password;


}
