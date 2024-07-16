package FichaPratica04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Exibe o menu
            System.out.println("Menu de Opções:");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário
            option = scanner.nextInt();

            // Processa a opção escolhida
            switch (option) {
                case 1:
                    System.out.println("Opção escolhida: Criar");
                    break;
                case 2:
                    System.out.println("Opção escolhida: Atualizar");
                    break;
                case 3:
                    System.out.println("Opção escolhida: Eliminar");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println(); // Adiciona uma linha em branco para separar as iterações do menu
        } while (option != 4);

        scanner.close();
    }
}

