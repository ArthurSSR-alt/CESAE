package FichaPratica07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio07 {
    public class ContadorFicheiro {

        public static void main(String[] args) {
            // Especifica o caminho do ficheiro de texto
            String nomeFicheiro = "Files/FichaPratica07/exercicio_07.txt";

            int numeroDeLinhas = 0;
            int numeroDePalavras = 0;

            try (BufferedReader leitor = new BufferedReader(new FileReader(nomeFicheiro))) {
                String linha;

                while ((linha = leitor.readLine()) != null) {
                    // Incrementa o contador de linhas
                    numeroDeLinhas++;

                    // Divide a linha em palavras usando espaços como delimitador
                    String[] palavras = linha.split("\\s+");
                    numeroDePalavras += palavras.length;
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao ler o ficheiro: " + e.getMessage());
            }

            // Imprime os resultados
            System.out.println("Número de linhas: " + numeroDeLinhas);
            System.out.println("Número de palavras: " + numeroDePalavras);
        }
    }
}
