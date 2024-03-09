package com.sistemaescolar.exerciciosm1s8.Classes;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Cursos {
    @Getter
    @Setter
    public class Aluno {

        @Setter(value = AccessLevel.NONE)
        private int id;

        private String nome;
        private String descricao;
        private int cargaHoraria;

        private static int proximoId = 1;
        private static int gerarId() {
            return proximoId++;
        }

        public Aluno(int id, String nome, String descricao, int cargaHoraria) {
            this.id = gerarId();
            this.nome = nome;
            this.descricao = descricao;
            this.cargaHoraria = cargaHoraria;
        }
    }
}
