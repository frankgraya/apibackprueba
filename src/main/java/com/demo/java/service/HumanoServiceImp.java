package com.demo.java.service;

import com.demo.java.model.Humano;
import com.demo.java.model.HumanoDTO;
import com.demo.java.repository.HumanoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HumanoServiceImp implements HumanoService {

    @Autowired
    private HumanoRepository humanoRepository;

    @Override
    public Humano crearHumano(Humano humano) {
        log.info("Se crearHumano con exito ");
        return humanoRepository.save(humano);
    }

    @Override
    public void borrarHumano(long id) {
        log.info("Se borrarHumano savePersona con exito ");
        humanoRepository.deleteById(id);
    }

    @Override
    public List<Humano> listarHumanos() {
        log.info("Se listarHumanos con exito ");
        return humanoRepository.findAll();
    }

    @Override
    public Humano buscarHumanoPorID(long id) {
        log.info("Se buscarHumanoPorID con exito ");
        return humanoRepository.findById(id).orElse(null);
    }
    @Override
    public void modificarHumano(Humano humano) {
        log.info("Se ModificarHumano con exito ");
        humanoRepository.save(humano);
    }

    @Override
    public HumanoDTO login(String usuario, String password) {
        Humano humano = humanoRepository.findByUsuarioAndPassword(usuario, password);
        if (humano == null) {
            return null; // O lanzar una excepción u otro manejo de error adecuado
        }
        return new HumanoDTO(
                humano.getId(),
                humano.getUbication(),
                humano.getPosition(),
                humano.getFullname(),
                humano.getImage()
        );
    }
}
