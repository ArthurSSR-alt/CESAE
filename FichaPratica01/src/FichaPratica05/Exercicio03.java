package FichaPratica05;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


     //Declarar variáveis

        int[] num = new int[10];
        int maior;

        //ler o vetor
        for (int i=0; i< num.length; i++){
            System.out.print("Número ["+i+"]: ");
            num[i] = input.nextInt();

        }
        //mostrar maior

        maior=num[0];

        //criar ciclo para apresentar o maior

        for (int i=0; i< num.length; i++){
            if (num[i]>maior){
                maior=num[i];


            }

        }
        //ler o maior

        System.out.println("Maior: "+maior);


    }
}
