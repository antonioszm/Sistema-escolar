package com.sistemaescolar.exerciciosm1s8.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
public class AlunoModel {

    @Getter
    public static ArrayList<AlunoModel> listaDeAlunos = new ArrayList<AlunoModel>();

    @Setter(value = AccessLevel.NONE)
    private int id;

    private String nome;
    private LocalDate dataNascimento;

    private static int proximoId = 1;
    private static int gerarId() {
        return proximoId++;
    }

    public static AlunoModel incluirNaLista(AlunoModel aluno){
        aluno.id = gerarId();
        AlunoModel.listaDeAlunos.add(aluno);
        return aluno;
    }
}
