package com.demo.java.excepciones;

public class EmpleadoNotFoundException extends RuntimeException  {
    public EmpleadoNotFoundException(String mensaje) {
        super(mensaje);
    }
}
