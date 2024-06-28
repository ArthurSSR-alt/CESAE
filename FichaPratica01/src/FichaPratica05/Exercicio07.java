package FichaPratica05;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];
        int antecessor;
        boolean maior = true;

        //ler o vetor
        for (int i=0; i< vetor.length; i++){
            System.out.print("Número ["+i+"]: ");
            vetor[i] = input.nextInt();

        }
        antecessor = vetor[0];
        //Verificar se os elementos estão em ordem crescente

        for (int i=0; i< vetor.length; i++){

            if (vetor[i] < antecessor){

                antecessor = vetor[i];
                maior = false;
            }

        }
        if (maior){
            System.out.println("Maior: ");

        }else{
            System.out.println();
        }
    }
}
