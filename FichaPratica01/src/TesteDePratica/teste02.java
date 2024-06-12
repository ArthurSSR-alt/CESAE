package TesteDePratica;
import java.util.Scanner;


public class teste02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, sub;

        System.out.println("Insira um numero; ");

        num1 = input.nextInt();

        System.out.println("Insira um numero: ");

        num2 = input.nextInt();

        sub = num1 - num2;

        System.out.println("Subtração; "+ sub);



    }
}
