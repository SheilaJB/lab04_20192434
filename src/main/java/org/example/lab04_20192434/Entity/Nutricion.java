package org.example.lab04_20192434.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "nutricion")
public class Nutricion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnutricion", nullable = true)
    private int idnutricion;

    @Column(name = "idreceta")
    private int idreceta;

    @Column(name = "calorias")
    private int calorias;

    @Column(name = "grasas")
    private double grasas;

    @Column(name = "proteinas")
    private double proteinas;

    @Column(name = "fibra")
    private double fibra;

    @Column(name = "carbohidratos")
    private double carbohidratos;



}
