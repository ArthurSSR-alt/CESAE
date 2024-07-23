package Ex_03;

public class Peixe {
    private String especie;
    private double peso;
    private double precoKg;

    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public double getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPrecoKg() {
        return precoKg;
    }
    public void exibirDetalhes(){
        System.out.println("Espécie: "+this.especie+ " | Peso: "+this.peso+" | Preço por Kg: "+this.precoKg);
    }
}
