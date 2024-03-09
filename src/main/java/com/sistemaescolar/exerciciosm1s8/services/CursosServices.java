package com.sistemaescolar.exerciciosm1s8.services;

import com.sistemaescolar.exerciciosm1s8.models.AlunoModel;
import com.sistemaescolar.exerciciosm1s8.models.CursosModel;

import java.util.ArrayList;

public class CursosServices {
    public CursosModel cadastrarCurso(CursosModel curso) throws Exception {
        if (validacao(curso)){
            return CursosModel.incluirNaLista(curso);
        }
        return null;
    }
    public ArrayList<CursosModel> consultarAlunos(){
        return CursosModel.getListaDeCursos();
    }

    public boolean validacao(CursosModel curso) throws Exception {
        if (curso.getNome().isBlank()){
            throw new Exception("ERRO Curso está sem nome!");
        }
        return true;
    }
}
