package FichaPratica01;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        //Import Scanner - uso sempre  que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num1, num2, soma, subtração, multiplicação, divisão;

        //ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        //Somar num1 e num2
        soma = num1 + num2;


        //Subtrair num1 e num2
        subtração = num1 - num2;

        //Multiplicar num1 e num2
        multiplicação = num1 * num2;

        //Dividir num1 e num2
        divisão = num1 / num2;

        //Apresentar o resultado

        System.out.println("Soma: "+ soma);

        //Apresentar o resultado

        System.out.println("Subtração: "+ subtração);

        //Apresentar o resultado

        System.out.println("Multiplicação: "+ multiplicação);

        //Apresentar o resultado

        System.out.println("Divisão: "+ divisão);


    }


}
