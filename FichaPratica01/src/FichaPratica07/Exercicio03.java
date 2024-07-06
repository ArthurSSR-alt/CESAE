package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Exercicio03 {


    public static void main(String[] args) throws FileNotFoundException {
    movendoFicheiros();
}

    public static void movendoFicheiros() throws FileNotFoundException {
        File primeiroFicheiro = new File("arquivosFicha07/exercicio_03_Alternativa01.txt"); //abrir ficheiro

        Scanner sc = new Scanner(primeiroFicheiro); //criar scanner

        String linha = "";

        while (sc.hasNextLine()) { //ler linha por linha
            linha += sc.nextLine() + "\n";
        }

        File segundoFicheiro = new File("novo.txt");

        PrintWriter impressora = new PrintWriter(segundoFicheiro);
        impressora.println(linha);

        impressora.close(); //salvar o que eu escrevi
        sc.close(); //gravar


    }
}





