package org.example.lab04_20192434.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "equipamiento")
public class Equipamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idequipamiento")
    private int idequipamiento;

    @Column(name = "nombre")
    private String nombre;

}
