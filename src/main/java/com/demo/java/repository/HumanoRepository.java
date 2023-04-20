package com.demo.java.repository;

import com.demo.java.model.Humano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Uso de query methods
@Repository
public interface HumanoRepository extends JpaRepository<Humano, Long> {
    public Humano findByUsuarioAndPassword(String usuario, String password);
}
