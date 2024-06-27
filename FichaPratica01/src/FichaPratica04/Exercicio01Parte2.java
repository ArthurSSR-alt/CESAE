package FichaPratica04;

import java.util.Scanner;

public class Exercicio01Parte2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Pedir ao usuário os dois valores
            System.out.print("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();

            // Pedir a operação
            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            // Realizar a operação e mostrar o resultado
            double resultado = 0;
            boolean operacaoValida = true;

            switch (operacao) {
                case '+':
                    resultado = valor1 + valor2;
                    break;
                case '-':
                    resultado = valor1 - valor2;
                    break;
                case '*':
                    resultado = valor1 * valor2;
                    break;
                case '/':
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("O resultado é: " + resultado);
            }

            // Perguntar se o usuário deseja continuar
            System.out.print("Deseja continuar? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false;
            }
        }
    }
}