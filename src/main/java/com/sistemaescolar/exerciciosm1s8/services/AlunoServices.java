package com.sistemaescolar.exerciciosm1s8.services;

import com.sistemaescolar.exerciciosm1s8.models.AlunoModel;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Random;

@Service
public class AlunoServices {

    public AlunoModel cadastrarAluno(AlunoModel aluno) throws Exception {
        if (validacao(aluno)){
            return AlunoModel.incluirNaLista(aluno);
        }
        return null;
    }
    public ArrayList<AlunoModel> consultarAlunos(){
        return AlunoModel.getListaDeAlunos();
    }

    public boolean validacao(AlunoModel aluno) throws Exception {
        if (aluno.getNome().isBlank()){
            throw new Exception("ERRO Aluno está sem nome!");
        }
        if (aluno.getDataNascimento() == null){
            throw new Exception("ERRO Aluno está sem data de nascimento!");
        }

        return true;
    }
}
