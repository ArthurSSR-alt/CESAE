package TesteDePratica;
import java.util.Scanner;


public class test03
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double comprimento, area, perimetro, largura;

        System.out.println("Insira um número: ");
        comprimento = input.nextInt();

        System.out.println("Insira um número: ");
        largura = input.nextInt();

        area = comprimento * largura;
        System.out.println("área: "+ area);

        perimetro = comprimento + largura + comprimento + largura;
        System.out.println("perimetro: "+ perimetro);















    }
}
