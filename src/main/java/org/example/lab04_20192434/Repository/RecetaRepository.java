package org.example.lab04_20192434.Repository;


import org.example.lab04_20192434.Entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Integer> {
    List<Receta> findByNombre(String nombre);
}
