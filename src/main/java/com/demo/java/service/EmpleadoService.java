package com.demo.java.service;

import com.demo.java.model.Empleado;

import java.util.List;

public interface EmpleadoService {

    public Empleado crearEmpleado(Empleado empleado);

    public void borrarEmpleado(long id);

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(long id);

    public void modificarEmpleado(Empleado empleado);


}
