package FichaPratica05;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int [] comissao = new int[12];
        double soma =0 ;
        int mes = 1;

        //ler vetor para mês
        for (int i = 0; i< comissao.length; i++){

            System.out.print("Mês [" + mes +"]: ");
            comissao[i] = input.nextInt();
            mes++;




        }
        //ler vetor para valores
        for (int i =0; i<comissao.length; i++) {
            soma += comissao[i];





        }
        System.out.println("Total anual: "+ soma);

    }
}
