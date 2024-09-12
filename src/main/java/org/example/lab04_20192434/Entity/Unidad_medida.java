package org.example.lab04_20192434.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "unidad_medida")
public class Unidad_medida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idunidad_medida")
    private int idunidad_medida;

    @Column(name = "nombre_unidad")
    private String nombre_unidad;

    @Column(name = "simbolo")
    private String simbolo;

}
