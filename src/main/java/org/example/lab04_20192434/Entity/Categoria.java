package org.example.lab04_20192434.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
    private int idcategoria;

    @Column(name = "categoria")
    private String categoria;

}
