package com.rafa.exercicios.revisao.poo.Exer02;

import java.util.Calendar;

public class Pessoa implements ISalvarArquivo{
    private String nome;
    private String CPF;
    private Calendar dataNasc;

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public void SalvarNoDisco() {

    }
}
