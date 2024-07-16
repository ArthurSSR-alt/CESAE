package FichaPratica02;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Declarar váriaveis
        double nota1, nota2, nota3, media;

        //ler nota1
        System.out.println("Insira a nota 1 (o-20): ");
        nota1 = input.nextDouble();

        //ler nota2
        System.out.println("Insira a nota 2 (o-20): ");
        nota2 = input.nextDouble();

        //ler nota3
        System.out.println("Insira a nota 3 (o-20): ");
        nota3 = input.nextDouble();

        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20 || nota3 < 0 || nota3 > 20) {
            System.out.println("Nota Inválidas");
        } else {


            //Calcular a media ponderada
            media = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4;


            if (media >= 9.5) {
                System.out.println("Aprovado");

            } else { // Negativa
                System.out.println("Reprovado");


            }
        }

        //System.out.prinln("Média");


    }
    }