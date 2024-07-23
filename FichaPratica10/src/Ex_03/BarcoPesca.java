package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadaeCarga;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadaeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadaeCarga = capacidadaeCarga;
        this.marca = marca;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public void pescarPeixe(Peixe peixeNovo) {
        if (peixeNovo.getPeso() < capacidadaeCarga) {
            System.out.println("Guarde o peixe!!" + peixeNovo);
        } else {
            System.out.println("JOGUE O PEIXE NO MAR ANTES QUE O BARCO AFUNDE!!");

        }

    }

    public void pescarMarisco(Marisco mariscoNovo) {
        if (mariscoNovo.getPeso() < capacidadaeCarga) {
            System.out.println("Guarde o Marisco para não se furar!!");

        } else {
            System.out.println("JOGUE ESSE MARISCO GIGANTE AO MAR!!!");
        }

    }

    public double calcularCargaAtual() {
        double cargaAtual = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            cargaAtual += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaAtual += mariscoAtual.getPeso();
        }
        return cargaAtual;
    }

    public void addPeixe(Peixe peixeNovo){
        if (this.calcularCargaAtual()+peixeNovo.getPeso()<=this.capacidadaeCarga){
            this.peixesPescados.add(peixeNovo);
        }
    }
    public void addMarisco(Marisco mariscoNovo){
        if (this.calcularCargaAtual()+mariscoNovo.getPeso()<=this.capacidadaeCarga){
            this.mariscoPescado.add(mariscoNovo);
        }
    }
    public void exibirDetalhes(){
        System.out.println("***** "+this.nome+" *****");
        System.out.println("Carga Atual: "+this.calcularCargaAtual()+" Kg.");

        System.out.println("Peixe Pescado: ");
        System.out.println("Marisco Pescado: ");

        System.out.println("\n Peixe Pescado: ");
        for (Peixe peixeAtual : this.peixesPescados) {
            peixeAtual.exibirDetalhes();
        }

        System.out.println("\n Marisco Pescado: ");
        for (Marisco mariscoAtual : this.mariscoPescado) {
            mariscoAtual.exibirDetalhes();
        }
        System.out.println("Valor Total da Carga: "+this.valortotal());

    }
    public void largarPeixe(int indexRemovido){
        this.peixesPescados.remove(indexRemovido);
    }
    public void largarMarisco(int indexRemovido){
        this.mariscoPescado.remove(indexRemovido);
    }
    public double valortotal(){
        double valorTotal=0;

        for (Peixe peixeAtual : this.peixesPescados) {
            valorTotal += peixeAtual.getPeso()* peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            valorTotal += mariscoAtual.getPeso()* mariscoAtual.getPrecoKg();
        }
        return valorTotal;

    }

}
