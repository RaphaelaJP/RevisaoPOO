import java.util.Scanner;

public class ConjuntoValores_Exer01 {

    private int conjuntoValores[] = new int [10];

    Scanner scan = new Scanner(System.in);

    public ConjuntoValores_Exer01(int[] conjuntoValores) {

    }

    public void informarValor (){
        for (int i = 0; i < conjuntoValores.length; i++){
            System.out.println("Informe o valor: ");
            conjuntoValores[i] = scan.nextInt();
        }

    }

    public void MostrarVetor(){
        for (int i = 0; i < conjuntoValores.length; i++){
            System.out.println("O valor do vetor é: " + conjuntoValores[i]);

        }

    }

    public int[] getConjuntoValores() {
        return conjuntoValores;
    }

    public void setConjuntoValores(int[] conjuntoValores) {
        this.conjuntoValores = conjuntoValores;
    }
}





