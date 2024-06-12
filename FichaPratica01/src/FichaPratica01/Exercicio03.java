package FichaPratica01;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {

        //Import Scanner - uso sempre  que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double area, perimetro, comprimento, largura;

        //ler comprimento
        System.out.print("Insira um número: ");
        comprimento = input.nextInt();

        //  ler largura
        System.out.print("Insira outro número: ");
        largura = input.nextInt();

        // calcular per
        perimetro = comprimento + comprimento + largura + largura;


        // calcular area
        area = comprimento * largura;


        // apresentar perimetro
        System.out.println("per: " + perimetro);


        // apresentar area
        System.out.println("area: " + area);


    }
}