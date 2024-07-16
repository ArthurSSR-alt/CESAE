package FichaPratica02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler valores
        System.out.print("Insira um número: ");
        num1 = imput.nextDouble();

        System.out.print("Insira um número: ");
        num2 = imput.nextDouble();

        // Ler operacao aritmética
        System.out.print("Operação desejada (+ - * /): ");
        operacao = imput.next();

        switch (operacao) {

            case "+": // Soma
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;

            case "-": // Subtracao
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;

            case "*": // Multiplicacao
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;

            case "/": // Divisao
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;

            default:
                System.out.println("Operação não reconhecida");
                break;


        }
    }
}