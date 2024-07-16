package FichaPratica02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int horas, minutos;

        System.out.print("Insira as horas: ");
        horas = input.nextInt();
        System.out.print("Insira as minutos: ");
        minutos = input.nextInt();


        if (horas>=12) { //Tarde (PM)

            if (horas != 12) {
                horas = horas - 12;
            }


            System.out.println(horas + ":" + minutos + "PM");

        }else{

            System.out.println(horas + ":"+minutos+"AM");




        }




    }
}
