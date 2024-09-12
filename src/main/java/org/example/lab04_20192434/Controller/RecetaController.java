package org.example.lab04_20192434.Controller;


import org.example.lab04_20192434.Entity.Receta;
import org.example.lab04_20192434.Repository.RecetaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recetas")
public class RecetaController {

    final RecetaRepository recetaRepository;
    public RecetaController(RecetaRepository recetaRepository) {
        this.recetaRepository = recetaRepository;
    }

    //Vista principal - listado de recestas
    @GetMapping("/lista")
    public String receta(Model model) {

        //Mostrar toda las recetas
        List<Receta> recetas = recetaRepository.findByNombre();

        model.addAttribute("receta", recetas);
        return "receta/lista";
    }
    //Mostrar detalles de una receta
    @GetMapping("/detalles")
    public String detalles() {
        return "detalles";
    }
    //Editar lista de recetas -> Formulario 1
    @GetMapping("/editar")
    public String editar() {
        return "formulario_1";
    }

    //Añadir un nuevo ingredientes -> Formulario 2
    @GetMapping("/nuevoIngredientes")
    public String nuevoIngredientes() {
        return "formulario_2";
    }

    //editar datos de nutrición -> Formulario 3
    @GetMapping("/editarNutricion")
    public String editarNutricion() {
        return "formulario_3";
    }


}
