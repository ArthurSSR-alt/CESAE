package FichaPratica02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Insira um número: ");
        a = input.nextInt();
        System.out.println("Insira outro número: ");
        b = input.nextInt();
        System.out.println("Insira outro número: ");
        c = input.nextInt();

        if (a < b && a < c) {// a ... ...
            if (b < c) {//a b c
                System.out.println(b + " " + a + " " + c);

            } else {
                System.out.println(b + " " + c + " " + a);

            }
        }

        if (c < a && c < b) { // c ... ...
            if (a < b) { // c a b
                System.out.println(c + " " + a + " " + b);
            } else { // c b a
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
