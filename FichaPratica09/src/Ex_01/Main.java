package Ex_01;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chiron", "Bugatti", 2016, 330, 2.0, TipoCombustivel.DIESEL, 100);
        Carro carro2 = new Carro("Veyron", "Bugatti", 2014, 330, 4.0, TipoCombustivel.DIESEL, 100);
        Carro carro3 = new Carro("SF900", "Ferrari", 2020, 800, 5000, TipoCombustivel.GASOLINA, 30);
        Carro carro4 = new Carro("Papa", "Reformas", 2000, 25, 500, TipoCombustivel.GPL, 22);

        Carro vencedorCorrida1 = carro1.corrida(carro2);
        Carro vencedorCorrida2 = carro3.corrida(carro4);

        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2);
        vencedorFinal.exibirDetalhes();


    }
}
