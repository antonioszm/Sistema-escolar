package com.sistemaescolar.exerciciosm1s8.controllers;

import com.sistemaescolar.exerciciosm1s8.models.AlunoModel;
import com.sistemaescolar.exerciciosm1s8.services.AlunoServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    private AlunoServices alunoServices;
    @GetMapping
    public ArrayList<AlunoModel> get(){
        return alunoServices.consultarAlunos();
    }

    @PostMapping
    public AlunoModel post(@RequestBody AlunoModel aluno) throws Exception {
        return alunoServices.cadastrarAluno(aluno);
    }
}
