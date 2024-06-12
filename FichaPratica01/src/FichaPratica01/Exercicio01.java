package FichaPratica01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma;

        //ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        //ler num2
        System.out.print("Insira outro número: ");
        num2 = input.nextInt();


        //Somar num1 e num2
        soma = num1 + num2;

        //Apresentar o resultado
        System.out.println("Soma: "+ soma);

    }
}
