package org.example.lab04_20192434.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "receta_ingrediente")
public class Receta_ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_receta_ingrediente", nullable = false)
    private int id_receta_ingrediente;

    @Column(name = "idreceta", nullable = false)
    private int idreceta;

    @Column(name = "idingrediente", nullable = false)
    private int idingrediente;

    @Column(name = "idunidad_medida", nullable = false)
    private int idunidad_medida;

    @Column(name = "cantidad")
    private int cantidad;
}
