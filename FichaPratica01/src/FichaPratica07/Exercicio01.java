package FichaPratica07;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio01 {
    public static void imprimirFicheiro() throws FileNotFoundException {
        Scanner leituradeficheiro = new Scanner(new File("Files/FichaPratica07/exercicio_01.txt"));
        String linha = leituradeficheiro.nextLine();
        while (leituradeficheiro.hasNextLine()) ;
        linha = leituradeficheiro.nextLine();
        System.out.println(linha);


    }

    public static void main(String[] args) throws FileNotFoundException {
        imprimirFicheiro();

    }


}

