package FichaPratica02;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      int lugar;

        System.out.print("Insira o lugar na corrida: ");
        lugar=input.nextInt();

        switch (lugar){

            case 1:
            System.out.println("ganhou 10 pontos");
            break;

            case 2:
                System.out.println("ganhou 8 pontos");
                break;
            case 3:
                System.out.println("ganhou 6 pontos");
                break;
            case 4:
                System.out.println("ganhou 5 pontos");
                break;
            case 5:
                System.out.println("ganhou 4 pontos");
                break;
            case 6:
                System.out.println("ganhou 3 pontos");
                break;
            case 7:
                System.out.println("ganhou 2 pontos");
                break;
            case 8:
                System.out.println("ganhou 1 pontos");
                break;
            default:
                System.out.println("não ganhou pontos");
                break;






        }






    }
}
