package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio05 {

    public static void somar() throws FileNotFoundException {//função (somar)

        //abrir ficheiro
        File primeiroFicheiro = new File("Files/FichaPratica07/exercicio_05_31.txt");
        //criar scanner
        Scanner scFicheiro = new Scanner(primeiroFicheiro);
        //ler inteiro
        System.out.println(scFicheiro.nextInt());
        //criar variável para inteiros e uma para soma
        int num,somatorio;
        //ciclo de leitura dos inteiros
        while (scFicheiro.hasNextInt()) {
            //colocar split para separar espaços
            //somar (onde pôr???)
            num = scFicheiro.nextInt();
            System.out.println(num);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        somar();


    }
}

