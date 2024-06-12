package FichaPratica01;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        int segundosTotais;

        System.out.print("Insira os minutos da música 1: ");
        segundosTotais= input.nextInt()*60;
        System.out.println("Insira os segundos da música 1: ");
        segundosTotais = input.nextInt();

        System.out.print("Insira os minutos da música 2: ");
        segundosTotais= input.nextInt()*60;
        System.out.println("Insira os segundos da música 2: ");
        segundosTotais = input.nextInt();

        System.out.print("Insira os minutos da música 3: ");
        segundosTotais= input.nextInt()*60;
        System.out.println("Insira os segundos da música 3: ");
        segundosTotais = input.nextInt();

        System.out.print("Insira os minutos da música 4: ");
        segundosTotais= input.nextInt()*60;
        System.out.println("Insira os segundos da música 4: ");
        segundosTotais = input.nextInt();

        System.out.print("Insira os minutos da música 5: ");
        segundosTotais= input.nextInt()*60;
        System.out.println("Insira os segundos da música 5: ");
        segundosTotais = input.nextInt();


        System.out.println("Segundos Totais do Álbum: " + segundosTotais);












    }
}
