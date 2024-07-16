package FichaPratica04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao Jogador 1 que insira um número entre 0 e 100
        System.out.print("Jogador 1, insira um número entre 0 e 100: ");
        int numeroEscolhido = scanner.nextInt();

        // Garantir que o número está entre 0 e 100
        while (numeroEscolhido < 0 || numeroEscolhido > 100) {
            System.out.print("Número inválido! Insira um número entre 0 e 100: ");
            numeroEscolhido = scanner.nextInt();
        }

        int tentativas = 0;
        int palpite = -1;

        // Solicita ao Jogador 2 que tente adivinhar o número
        System.out.println("Jogador 2, tente adivinhar o número.");

        // Loop até o Jogador 2 acertar o número
        while (palpite != numeroEscolhido) {
            System.out.print("Insira seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroEscolhido) {
                System.out.println("O número é maior que " + palpite);
            } else if (palpite > numeroEscolhido) {
                System.out.println("O número é menor que " + palpite);
            }
        }

        // Informa o número de tentativas necessárias
        System.out.println("Parabéns! Você acertou o número " + numeroEscolhido + " em " + tentativas + " tentativas.");

        scanner.close();
    }
}
