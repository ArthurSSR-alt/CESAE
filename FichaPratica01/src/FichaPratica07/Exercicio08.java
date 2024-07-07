package FichaPratica07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio08 {
    public class CalculaVendas {

        public static void main(String[] args) {
            String filePath = "Files/FichaPratica07/exercicio_08.csv"; // Caminho para o arquivo CSV
            String line = "";
            String csvSplitBy = ","; // Delimitador do CSV

            double valorTotalVendas = 0.0;

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                // Ignorar a primeira linha que contém o cabeçalho
                br.readLine();

                while ((line = br.readLine()) != null) {
                    // Dividir a linha em campos
                    String[] campos = line.split(csvSplitBy);

                    String tipoProduto = campos[0];
                    String produto = campos[1];
                    int quantidadeVendida = Integer.parseInt(campos[2]);
                    double valorUnitario = Double.parseDouble(campos[3]);

                    // Calcular o valor total para esta linha
                    double valorVenda = quantidadeVendida * valorUnitario;

                    // Adicionar ao total
                    valorTotalVendas += valorVenda;
                }

                // Exibir o valor total das vendas
                System.out.printf("O valor total das vendas é: R$%.2f\n", valorTotalVendas);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
