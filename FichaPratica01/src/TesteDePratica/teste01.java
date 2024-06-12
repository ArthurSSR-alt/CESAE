package TesteDePratica;

//import java util scanner - eu uso para receber informações do utilizador

import java.util.Scanner;
public class teste01 {

    //main eu uso para ativar a execução dos códigos


    public static void main(String[] args) {

        //Input eu uso para permitir a leitura das informações do utilizador

        Scanner input = new Scanner(System.in);

        //int eu uso para validar as variáveis

        int num1, num2, soma;

        //ler num1

        System.out.println("Insira um número: ");
        num1 = input.nextInt();


        //ler num2

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        //apresentar soma
        soma = num1 + num2;
        System.out.println("Soma: "+ soma);







    }


}
