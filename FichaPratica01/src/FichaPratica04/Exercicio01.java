package FichaPratica04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, resultado;
        String operacao;
        String txt;


        System.out.print("Introduza um valor: ");
        valor1 = input.nextInt();
        System.out.print("introduza outro valor: ");
        valor2 = input.nextInt();
        System.out.println("Operação desejada (+ - * /): ");
        operacao = input.next();


        //Perguntar ao utilizador se desejar repetir, efetuando novos cálculos.

        System.out.print("Deseja continuar? (Introduza s/n): ");

        txt = input.next();


        do {

            switch (operacao) {

                case "+": // Soma

                    resultado = valor1 + valor2;
                    System.out.println(valor1 + " + " + valor2 + " = " + resultado);
                    break;

                case "-": // Subtracao

                    resultado = valor1 - valor2;
                    System.out.println(valor1 + " - " + valor2 + " = " + resultado);
                    break;

                case "*": // Multiplicacao
                    resultado = valor1 * valor2;
                    System.out.println(valor1 + " * " + valor2 + " = " + resultado);
                    break;

                case "/": // Divisao
                    resultado = valor1 / valor2;
                    System.out.println(valor1 + " / " + valor2 + " = " + resultado);
                    break;

                default:
                    System.out.println("Operação não reconhecida");
                    break;


            }

        } while (false);
    }


}