package Ex_05;

public class Carro {

    private String modelo;
    private String marca;
    private String ligar = "O carro está ligado";
    private int anoDeFabrico;

    public Carro(String modelo, String marca, int anoDeFabrico) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeFabrico = anoDeFabrico;

    }

    public void ligar() {
        System.out.println(this.ligar);

    }


}
