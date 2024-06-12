package FichaPratica01;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int valor1, valor2, valor3;

        System.out.println("Introduza o valor1: ");
        valor1 = input.nextInt();
        System.out.println("Introduza o valor2: ");
        valor2 = input.nextInt();

        valor3 = valor1;

        valor1 = valor2;

        valor2 = valor3;

        System.out.println("valor1 "+ valor1);
        System.out.println("valor2 "+ valor2);



    }
}
