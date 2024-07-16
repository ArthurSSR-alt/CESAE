package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declarar variáveis
        String letra;

        // Ler letra
        System.out.print("Insira uma letra: ");
        letra = input.next();

        // Passar para minuscula
        letra=letra.toLowerCase();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal");
                break;

            default:
                System.out.println("Consoante");
        }
    }
}
