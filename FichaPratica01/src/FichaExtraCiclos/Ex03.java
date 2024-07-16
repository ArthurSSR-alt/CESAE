package FichaExtraCiclos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ciclo para alternar entre tabuadas
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabuada do " + i + ":");

            // Ciclo para alternar entre linhas de uma tabuada
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();

        }
    }
}
