package com.sistemaescolar.exerciciosm1s8.controllers;

import com.sistemaescolar.exerciciosm1s8.models.CursosModel;
import com.sistemaescolar.exerciciosm1s8.services.CursosServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("cursos")
public class CursoController {
    private CursosServices cursosServices;
    @GetMapping
    public ArrayList<CursosModel> get(){
        return cursosServices.consultarCursos();
    }

    @PostMapping
    public CursosModel post(@RequestBody CursosModel curso) throws Exception {
        return cursosServices.cadastrarCurso(curso);
    }
}
