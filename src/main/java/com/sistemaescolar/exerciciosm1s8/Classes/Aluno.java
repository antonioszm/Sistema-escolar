package com.sistemaescolar.exerciciosm1s8.Classes;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Aluno {

    @Setter(value = AccessLevel.NONE)
    private int id;

    private String nome;
    private Date dataNascimento;

    private static int proximoId = 1;
    private static int gerarId() {
        return proximoId++;
    }

    public Aluno(int id, String nome, Date dataNascimento) {
        this.id = gerarId();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
