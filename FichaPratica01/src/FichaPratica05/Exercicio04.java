package FichaPratica05;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis

        int[] num = new int[4];
        int menor;

        //ler o vetor
        for (int i=0; i< num.length; i++){
            System.out.print("Número ["+i+"]: ");
            num[i] = input.nextInt();

        }
        //mostrar maior

        menor=num[0];

        //criar ciclo para apresentar o menor

        for (int i=0; i< num.length; i++){
            if (num[i]<menor){
                menor=num[i];


            }

        }
        //ler o maior

        System.out.println("Menor: "+menor);
    }
}
