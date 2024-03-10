package com.sistemaescolar.exerciciosm1s8.services;

import com.sistemaescolar.exerciciosm1s8.models.AlunoModel;
import com.sistemaescolar.exerciciosm1s8.models.CursosModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

@Service
public class CursosServices {
    public CursosModel cadastrarCurso(CursosModel curso) throws Exception {
        if (validacao(curso)){
            return CursosModel.incluirNaLista(curso);
        }
        return null;
    }
    public ArrayList<CursosModel> consultarCursos(){
        return CursosModel.getListaDeCursos();
    }

    public boolean validacao(CursosModel curso) throws Exception {
        if (!StringUtils.hasText(curso.getNome())){
            throw new Exception("ERRO Curso está sem nome!");
        }
        return true;
    }
}
