package com.demo.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * LOS DTOS
 * SIRVEN PARA MOSTRAR DATOS DE SOLO LO QUE QUEREMOS SIN ESPECIFICAR
 */
@Data
@AllArgsConstructor
@Getter
@Setter
public class HumanoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String ubication;
    private String position;
    private String fullname;
    private String image;

}
