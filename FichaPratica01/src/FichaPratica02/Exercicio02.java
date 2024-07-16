package FichaPratica02;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario1, taxa;

        System.out.print("Introduza um salario: ");
        salario1 = input.nextDouble();

        //quando o salario for menor ou igual que 15k euros paga 20% de taxa
        if(salario1<=15.000) {
            salario1 = salario1 * 0.2;


            System.out.println("paga taxa de 20%: " + salario1);

        }

        if (salario1>15.000){
            salario1 = salario1 *0.3;

            System.out.println("paga taxa de 30%: "+salario1);
        }



        //quando for maior que 15k euros paga taxa de 30%




    }


    }
