package Exer01;

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

    //Metodo da bolha - BoobleSort
    public void ordenarVetor (){
        for (int ultEle = conjVal.length - 1; ultEle > 0; ultEle--){
            for(int i = 0; i < ultEle; i++){
                if (conjVal[i] > conjVal[i+1]){
                    trocar (conjVal, i, i+1);
                }

            }
        }
        System.out.println("--- Mostrando Vetor Ordenado de forma Crescente ---");
        mostrarVetor();
    }

    public void trocar(int[] conjVal, int i, int j) {
        int aux = conjVal[i];
        conjVal[i]  = conjVal[j];
        conjVal [j] = aux;
    }

    public int[] getConjVal() {
        return conjVal;
    }

    public void setConjVal(int[] conjVal) {
        this.conjVal = conjVal;
    }
}





