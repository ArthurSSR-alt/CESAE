package FichaPratica02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declara variáveis
        int a, b, c;

        //ler valores
        System.out.print("Insira um número: ");
        a = input.nextInt();

        System.out.print("Insira um múmero: ");
        b = input.nextInt();

        System.out.print("Insira um múmero: ");
        c = input.nextInt();

        if (a<b && a<c) {
            System.out.println("Menor: " + a);
        }
            if (b<a && b<c) {
                System.out.println("Menor: " + b);
            }
                if (c<a && c<b) {
                    System.out.println("Menor: " + c);

                }






    }
}
