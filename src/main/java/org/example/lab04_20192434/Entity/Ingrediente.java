package org.example.lab04_20192434.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "ingrediente")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idingrediente")
    private int idIngrediente;

    @Column(name = "nombre")
    private String nombre;
}
