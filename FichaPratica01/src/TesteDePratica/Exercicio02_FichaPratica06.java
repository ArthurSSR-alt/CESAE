package TesteDePratica;
import java.util.Scanner;
public class Exercicio02_FichaPratica06 {
    /**
     * MétodoMétodo que lê um número inteiro e positivo do user
     *
     * @return Número Inteiro e Positivo
     */
    public static int lerPositivoInteiro() {
        Scanner sc = new Scanner(System.in);
        int numeroLido;

        do {
            System.out.println("Introduza um número: ");
            numeroLido = sc.nextInt();

        } while (numeroLido < 0);

        return numeroLido;

    }
    /**
     * Método que imprime uma linha com x asteriscos
     * @param quantidadeAsteriscos Quantidade de Asteriscos a serem impressos
     */
    public static void linhasAsteriscos(int quantidadeAsteriscos){
    for (int i=0; i< quantidadeAsteriscos; i++){
        System.out.println("*");

    }
    System.out.println();

    }
    public static void main(String[] args) {
        int numeroUser= lerPositivoInteiro();
        linhasAsteriscos(numeroUser);
    }




}
