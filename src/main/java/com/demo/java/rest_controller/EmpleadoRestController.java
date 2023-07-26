package com.demo.java.rest_controller;


import com.demo.java.excepciones.EmpleadoNotFoundException;
import com.demo.java.model.Empleado;
import com.demo.java.service.EmpleadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService empleadoService;


    //Este metodo Sirve para lista empleados
    @GetMapping("/empleado")
    public List<Empleado> listarTodosLosEmpleados() {
        log.warn("List<Empleado CONTROLLER");
        List<Empleado> empleados = empleadoService.listarEmpleados();
        if (empleados.isEmpty()) {
            throw new EmpleadoNotFoundException("No se encontraron empleados.");
        }
        return empleados;
    }

    //Este metodo Sirve para crearEmpleado
    @PostMapping("/empleado")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
        log.warn("guardarEmpleado CONTROLLER");
        return empleadoService.crearEmpleado(empleado);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadosPorId(@PathVariable Long id) {
        Empleado empleado = empleadoService.buscarEmpleadoPorId(id);
        if (empleado != null) {
            return ResponseEntity.ok(empleado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
///comentado///
    //1
    //2
    //3
    //4
    //5
    //6
    //7
    //8
    public ResponseEntity<Empleado> actualizarEmpleadosPorId(@PathVariable Long id, @RequestBody Empleado detallesEmpleado) {
        Empleado empleado = empleadoService.buscarEmpleadoPorId(id);

        empleado.setNombre(detallesEmpleado.getNombre());
        empleado.setApellido(detallesEmpleado.getApellido());
        empleado.setEmail(detallesEmpleado.getEmail());
        empleado.setImage(detallesEmpleado.getImage());

        Empleado empleadoActualizado = empleadoService.crearEmpleado(empleado);
        if (empleado != null) {
            return ResponseEntity.ok(empleadoActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
