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

    public void MostrarVetor(){
        for (int i = 0; i < conjVal.length; i++){
            System.out.println("O valor no indice " + i + " Do vetor é: " + conjVal[i]);

        }
    }

    public int[] getConjuntoValores() {
        return conjVal;
    }

    public void setConjuntoValores(int[] conjuntoValores) {
        this.conjVal = conjuntoValores;
    }
}





