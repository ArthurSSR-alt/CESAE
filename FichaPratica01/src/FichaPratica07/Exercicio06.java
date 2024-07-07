package FichaPratica07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio06 {
    public class PessoaMaisVelha {
        public static void main(String[] args) {
            String nomeFicheiro = "Files/FichaPratica07/exercicio_06.txt";

            String nomeMaisVelha = "";
            int maiorIdade = -1;

            try (BufferedReader br = new BufferedReader(new FileReader(nomeFicheiro))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    // Supondo que cada linha está no formato "Nome,Idade"
                    String[] partes = linha.split(",");
                    String nome = partes[0].trim();
                    int idade = Integer.parseInt(partes[1].trim());

                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                        nomeMaisVelha = nome;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("A pessoa mais velha é: " + nomeMaisVelha + " com " + maiorIdade + " anos.");
        }
    }
}
