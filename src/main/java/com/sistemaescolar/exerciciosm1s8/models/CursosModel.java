package com.sistemaescolar.exerciciosm1s8.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class CursosModel {
    @Getter
    public static ArrayList<CursosModel> listaDeCursos = new ArrayList<CursosModel>();

    @Setter(value = AccessLevel.NONE)
    private int id;

    private String nome;
    private String descricao;
    private int cargaHoraria;

    private ArrayList<AlunoModel> alunosMatriculados = new ArrayList<>();

    private static int proximoId = 1;
    private static int gerarId() {
        return proximoId++;
    }

    public static CursosModel incluirNaLista(CursosModel curso){
        curso.id = gerarId();
        CursosModel.listaDeCursos.add(curso);
        return curso;
    }

    public static void matricularAluno(CursosModel curso, AlunoModel aluno){
        curso.getAlunosMatriculados().add(aluno);
    }
}

