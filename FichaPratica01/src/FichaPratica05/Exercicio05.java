package FichaPratica05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis

        int[] num = new int[10];
        double soma=0;

        //ler o vetor
        for (int i=0; i< num.length; i++){
            System.out.print("Número ["+i+"]: ");
            num[i] = input.nextInt();


        }
        //mostrar soma


        //criar ciclo para apresentar a média

        for (int i=0; i< num.length; i++){
            soma = soma+num[i];


        }
        //ler a média

        System.out.println("Média: "+ soma / 10);
    }
}
