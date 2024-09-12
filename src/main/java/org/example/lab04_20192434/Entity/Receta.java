package org.example.lab04_20192434.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceta", nullable = true)
    private int idreceta;

    @Column(name = "idcategoria")
    private int idcategoria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "instrucciones")
    private String instrucciones;

    @Column(name = "dificultad")
    private String dificultad;

    @Column(name = "tiempo_preparacion")
    private String tiempoPreparacion;

}
