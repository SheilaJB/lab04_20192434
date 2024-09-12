package org.example.lab04_20192434.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "receta_equipamiento")
public class Receta_equipamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceta_equipamiento", nullable = false)
    private int idreceta_equipamiento;

    @Column(name = "idreceta", nullable = false)
    private int idreceta;

    @Column(name = "idequipamiento", nullable = false)
    private int idequipamiento;
}
