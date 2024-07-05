package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Exercicio04 {
    public static void imprimir() throws FileNotFoundException {

        File primeiroFicheiro = new File("Files/FichaPratica07/exercicio_04.csv");
        Scanner scFicheiro= new Scanner(primeiroFicheiro);
        System.out.println(scFicheiro.nextLine());
        String linha= " ";
        while (scFicheiro.hasNextLine()) {
            linha=scFicheiro.nextLine();
            linha.split(";");
            System.out.println(linha+"\n");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
     imprimir();

    }
}
