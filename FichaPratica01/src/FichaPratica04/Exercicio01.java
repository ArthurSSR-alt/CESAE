package FichaPratica04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, resultado;
        String txt;

        System.out.println("Introduza um valor: ");
        valor1 = input.nextInt();
        System.out.println("introduza outro valor: ");
        valor2 = input.nextInt();





        //Perguntar ao utilizador se desejar repetir, efetuando novos cálculos.
        System.out.print("Deseja continuar? (Introduza s/n): ");
        txt = input.next();

        do {
            System.out.println("Soma");
            System.out.println("Subtração");
            System.out.println("Divisão");
            System.out.print("Operação desejada (+ - * /): ");
            resultado = input.next();

            switch (resultado) {

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

        } while (resultado != 0) ;
    }


    }