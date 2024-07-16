package FichaPratica01;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double preco1, preco2 ,preco3, precoTotal, precoComDesconto;

        System.out.println("Insira o precço1: ");
        preco1 = input.nextDouble();

        System.out.println("Insira o preço2: ");
        preco2 = input.nextDouble();

        System.out.println("Insira o preço3: ");
        preco3 = input.nextDouble();

        precoTotal = preco1 + preco2 + preco3;

        precoComDesconto = precoTotal*0.9;

        System.out.println("Preço Total: " + precoTotal);
        System.out.println("Preço c/10% de desconto: " + precoComDesconto);










    }
}
