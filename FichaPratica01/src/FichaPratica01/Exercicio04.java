package FichaPratica01;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {

        //Import Scanner - uso sempre  que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double area, raio, pi = 3.14;

        //ler raio
        System.out.print("Insira um número: ");
       raio = input.nextInt();

        // calcular area
        area = pi * raio * raio;

        // apresentar area
        System.out.println("area: " + area);

    }

}
