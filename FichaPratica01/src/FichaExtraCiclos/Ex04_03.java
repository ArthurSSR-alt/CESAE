package FichaExtraCiclos;

import java.util.Scanner;

public class Ex04_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linhas = 4; // Número de linhas a serem impressas
        int espacos = linhas - 1; // Número inicial de espaços em cada linha
        int asteriscos = 1; // Número inicial de asteriscos em cada linha

        // Ciclo para cada linha
        for (int i = 0; i < linhas; i++) {

            // Imprimir espaços em branco
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            // Enter
            System.out.println();

            // Atualizar contadores de espaços e asteriscos para a próxima linha
            espacos--;
            asteriscos += 2;
        }
    }
}
