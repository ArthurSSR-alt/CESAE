package FichaPratica05;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declarar variáveis
        int[][] matriz = new int[5][5];
        int somatorio = 0;

        for (int linha=0; linha<matriz.length; linha++){
            for (int coluna=0; coluna< matriz[0].length; coluna++){
                System.out.print("Introduza na matriz["+linha+ "]["+coluna+"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        //Imprimir matriz
        for (int linha=0; linha< matriz.length; linha++){
            for (int coluna=0; coluna<matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna]+"\t|\t");
                somatorio= somatorio+matriz[linha][coluna];
            }
            System.out.println();
        }
        System.out.println("Somatorio: "+somatorio);

    }
}
