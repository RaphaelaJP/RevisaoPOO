package com.rafa.exercicios.revisao.poo.Exer01;

import com.rafa.exercicios.revisao.poo.Exer01.ConjuntoValores;

import java.io.File;
import java.io.FileNotFoundException;

public class TestExer_01 {

    public static void main(String[] args) throws FileNotFoundException {

        ConjuntoValores cj = new ConjuntoValores();

        cj.informarValor();
        cj.mostrarVetor();
        System.out.println(cj.toString());
        cj.criarArquivo(cj.getConjVal());
        cj.preencherArquivo(4, cj.getConjVal());
        cj.carregarDadosArquivo(cj.getConjVal());

    }
}