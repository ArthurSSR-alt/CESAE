package FichaPratica02;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis

        int opcao;

        //Apresentar opções
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        //Ler as variáveis
        System.out.print("Insira uma opção");
        opcao = input.nextInt();

        //Apresentar switch case
        switch (opcao) {
            case 1:
                System.out.println("*** Criar ***");
                break;

            case 2:
                System.out.println("*** Atualizar ***");
                break;

            case 3:
                System.out.println("*** Eliminar ***");
                break;
            case 4:

                break;

            default:
                System.out.println();
                break;
        }
















    }
}
