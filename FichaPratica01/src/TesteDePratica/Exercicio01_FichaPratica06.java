package TesteDePratica;

import java.util.Scanner;

public class Exercicio01_FichaPratica06 {
    public static void fazerBarulho(String animal){
        animal = animal.toLowerCase();

        switch (animal){
            case "cao":
            case "cão":
                System.out.println("Au au au");
                break;

            case "gato":
                System.out.println("Miau");
                break;

            case"peixe":
                System.out.println("Glub glub glub");
                break;

            case"vaca":
                System.out.println("Muuuuuu");
                break;

            case"porco":
                System.out.println("Oinc oinc oinc");
                break;

            default:
                System.out.println("Barulho estranho");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animalEscolhido;

        while (true){
            System.out.println("Introduza um animal: ");
            animalEscolhido=sc.next();
            fazerBarulho(animalEscolhido);

        }
    }
}
