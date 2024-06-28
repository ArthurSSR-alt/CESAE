package FichaPratica05;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     // Declarar variáveis
        int[] num = new int[10];
        int antecessor;
        boolean crescente = true;

        //ler o vetor
        for (int i=0; i< num.length; i++){
            System.out.print("Número ["+i+"]: ");
            num[i] = input.nextInt();

        }
        antecessor = num[0];
        //Verificar se os elementos estão em ordem crescente

        for (int i=0; i< num.length; i++){

            if (num[i] < antecessor){

                antecessor = num[i];
                crescente = false;
            }

        }
        if (crescente){
            System.out.println("--Ordem Crescente--");

        }else{
            System.out.println("--Ordem Não Crescente--");
        }
    }
}
