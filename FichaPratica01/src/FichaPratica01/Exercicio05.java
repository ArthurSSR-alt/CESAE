package FichaPratica01;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {

        //Import Scanner - uso sempre  que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double num1, num2, num3, media, soma;

        //ler num1, num2, num3
        System.out.print("Insira um número: ");
        num1 = input.nextInt();
        System.out.print("Insira um número: ");
        num2 = input.nextInt();
        System.out.print("Insira um número: ");
        num3 = input.nextInt();


        // somar num1, num2, num3
        soma = num1 + num2 + num3;


        // dividir a soma por 3
        media = soma / 3;


        //apresentar a media
        System.out.println("media: " + media);

        //calcular a media ponderada, após isso aplicar as porcentagens de 20%, 30% e 50%


        // somar num1, num2, num3
        soma = num1 + num2 + num3;


        // calcular a media

        media = num1 * 0.2 + num2 * 0.3 + num3 * 0.5;

        //apresentar a media ponderada

        System.out.println("media ponderada: "+ media);






    }
}
