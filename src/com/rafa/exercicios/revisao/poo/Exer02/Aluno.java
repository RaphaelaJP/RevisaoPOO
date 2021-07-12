package com.rafa.exercicios.revisao.poo.Exer02;

public class Aluno extends Pessoa {
    private String Matricula;

    public Aluno() {

    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    @Override
    public void SalvarNoDisco() {
        super.SalvarNoDisco();
    }
}

