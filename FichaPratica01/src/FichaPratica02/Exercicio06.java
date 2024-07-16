package FichaPratica02;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print(" Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        if(num1>num2){

            System.out.println("Maior: "+num1);
        }else {
            System.out.println("Maior: " + num2);


        }

        if(num1<num2){

            System.out.println("Menor: "+num1);
            }else {
                System.out.println("Menor: " + num2);
            }


    }
}
