package FichaPratica05;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[3];

        //Ler o vetor
        for (int i = 0; i< vetor.length; i++) {
            System.out.print("Introduza um Vetor[" + i +"]: ");
            vetor [i] = input.nextInt();


        }

        System.out.println("\n______________________________________\n");

        //Imprimir vetor
        for (int i =0; i< vetor.length; i++) {
            System.out.println("Vetor[" +i+ "] =" +vetor[i]);
        }

    }
}
