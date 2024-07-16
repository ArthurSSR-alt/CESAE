package FichaPratica02;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario1, taxa;

        System.out.print("Introduza um salário: ");
        salario1 = input.nextDouble();

        if (salario1 <= 15.000) {
            taxa = salario1 * 0.2;

            System.out.println("paga taxa de 20%: " + taxa);


        }

        if (salario1 >= 15.000 && salario1<20.000) {
            taxa = salario1 * 0.3;

            System.out.println("paga taxa de 30%: " + taxa);


        }


        if (salario1 >= 20.000 && salario1<25.000) {
            taxa = salario1 * 0.35;

            System.out.println("paga taxa de 35%: " + taxa);


        }


        if (salario1 > 25.000)  {
            taxa = salario1 * 0.4;

            System.out.println("paga taxa de 40%: " + taxa);
        }

    }
}