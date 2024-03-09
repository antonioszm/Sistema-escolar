package com.sistemaescolar.exerciciosm1s8.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
public class AlunoModel {

    public static ArrayList<AlunoModel> listaDeAlunos = new ArrayList<AlunoModel>();

    @Setter(value = AccessLevel.NONE)
    private int id;

    private String nome;
    private Date dataNascimento;

    private static int proximoId = 1;
    private static int gerarId() {
        return proximoId++;
    }

}
