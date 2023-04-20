package com.demo.java.service;

import com.demo.java.model.Humano;
import com.demo.java.model.HumanoDTO;

import java.util.List;

public interface HumanoService {
    public Humano crearHumano(Humano humano);
    public void borrarHumano(long id);
    public List<Humano> listarHumanos();
    public Humano buscarHumanoPorID(long id);
    public void modificarHumano(Humano humano);
    public HumanoDTO login(String usuario, String password);
}
