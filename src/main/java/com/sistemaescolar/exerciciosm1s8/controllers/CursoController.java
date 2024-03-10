package com.sistemaescolar.exerciciosm1s8.controllers;

import com.sistemaescolar.exerciciosm1s8.models.AlunoModel;
import com.sistemaescolar.exerciciosm1s8.models.CursosModel;
import com.sistemaescolar.exerciciosm1s8.services.CursosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("cursos")
public class CursoController {
    private final CursosServices cursosServices;

    public CursoController(CursosServices cursosServices) {
        this.cursosServices = cursosServices;
    }

    @GetMapping
    public ArrayList<CursosModel> get(){
        return cursosServices.consultarCursos();
    }

    @PostMapping
    public CursosModel post(@RequestBody CursosModel curso) throws Exception {
        return cursosServices.cadastrarCurso(curso);
    }
    @PostMapping("{id}/add-aluno")
    public CursosModel post(@PathVariable int id, AlunoModel aluno) throws Exception {
        return cursosServices.matricularAluno(id, aluno.getId());
    }
}
