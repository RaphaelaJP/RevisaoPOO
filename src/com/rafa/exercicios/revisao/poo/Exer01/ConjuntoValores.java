package com.rafa.exercicios.revisao.poo.Exer01;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ConjuntoValores {

    private int conjVal[] = new int [5];

    Scanner scan = new Scanner(System.in);

    public ConjuntoValores() {

    }

    public void informarValor (){
        for (int i = 0; i < conjVal.length; i++){
            System.out.println("Informe o valor: ");
            conjVal[i] = scan.nextInt();
        }
    }

    public void mostrarVetor(){
        for (int i = 0; i < conjVal.length; i++){
            System.out.println("O valor no indice " + i + " Do vetor é: " + conjVal[i]);
        }
    }

    public int[] getConjVal() {
        return conjVal;
    }

    public void setConjVal(int[] conjVal) {
        this.conjVal = conjVal;
    }

    public void criarArquivo(int[] conjVal){
        File file = new File("Arquivo_inteiros");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("O arquivo foi criado?" + newFile);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void preencherArquivo(int qtdElementos, int[] conjVal){

        try{
            File arquivo = new File("Arquivo_inteiros");
             FileWriter aw = new FileWriter(arquivo);
            for (int i =0; i< qtdElementos; i++){
                 Integer corpo = conjVal[i];
                 aw.write(corpo.toString() + "\n");
             }
             aw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void carregarDadosArquivo (int[]conjVal) throws FileNotFoundException {
        try {
            File arquivo = new File("Arquivo_inteiros");
            Scanner lerArquivo = new Scanner (arquivo);
            for (int i = 0; i < conjVal.length; i++){
                conjVal[i] = lerArquivo.nextInt();
            }
            mostrarVetor();
        }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }


    @Override
    public String toString() {
        return "ConjuntoValores{" +
                "conjVal=" + Arrays.toString(conjVal) + '}';
    }
}






