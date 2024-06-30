package FichaPratica05;

import java.util.Scanner;

public class Exercicio08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Por favor, insira 9 números inteiros:");

        // Leitura dos 9 números inteiros do usuário e armazenar na matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("A matriz 3x3 inserida é:");

        // Impressão da matriz no formato desejado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Para mudar de linha após imprimir cada linha da matriz
        }
        scanner.close();


    }
}
