package com.demo.java.service;

import com.demo.java.model.Empleado;
import com.demo.java.repository.EmpleadoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;


    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        log.info("se entro al metodo Crear un humano con exito " + empleado.toString());

        return empleadoRepository.save(empleado);
    }

    @Override
    public void borrarEmpleado(long id) {
        log.info("se entro al metodo Crear un humano con exito " + id);
        empleadoRepository.deleteById(id);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarEmpleado(Empleado empleado) {
            empleadoRepository.save(empleado);
    }
}
