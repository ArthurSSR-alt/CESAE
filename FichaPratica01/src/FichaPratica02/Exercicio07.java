package FichaPratica02;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        if (num1 % 2==0) {
            System.out.println("Par: " + num1);



    }else {

            System.out.println("Ímpar: " + num1);

        }





    }
}
