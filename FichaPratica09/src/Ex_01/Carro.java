package Ex_01;

public class Carro {

    private String modelo;
    private String marca;
    private String ligar = "O carro está ligado";
    private int anoDeFabrico;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double consumo100Km;


    public Carro(String modelo, String marca, int anoDeFabrico, int potencia, double cilindrada, TipoCombustivel tipoCombustivel, int litros100Km) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeFabrico = anoDeFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo100Km = litros100Km;

    }

    public void ligar() {
        System.out.println(this.ligar);

    }

    public void especificacoes() {
        int idade = 2024 - anoDeFabrico;
        if (idade > 30) {
            if (tipoCombustivel.equals(TipoCombustivel.DIESEL)) {


                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado! \n Vrum-vrum-vrum");

            } else {
                System.out.println("Custa a pegar... O carro está ligado! \n Vrum-vrum-vrum");

            }


        } else {

            if (potencia >= 250) {
                System.out.println("O carro está ligado! \n VRUUMMMMMM");

            } else {
                System.out.println("O carro está ligado! \n Vruummmmmmm");

            }

        }

    }

    public Carro corrida(Carro adversario) {
        if (this.potencia>adversario.potencia) {
            //Ganha o meu carro por potencia
            return this;
        }else{

            if (this.potencia<adversario.potencia){
                //Ganha o adversario por potencia
                return adversario;
            }else{
                //Empate por potencia
                if (this.cilindrada>adversario.cilindrada){
                    //Ganha o meu carro por cc
                    return this;
                }else{
                    //Ganha o adversario por cc
                    if (this.cilindrada<adversario.cilindrada){
                        return adversario;
                    }else{
                        //Empate de cc

                        if (this.anoDeFabrico>adversario.anoDeFabrico){
                            //Ganha o meu carro por ser mais recente
                            return this;
                        }else{

                            if (this.anoDeFabrico<adversario.anoDeFabrico){
                                return adversario;
                            }else{
                                //empate total
                                return null;
                            }
                        }
                    }
                }
            }


        }


    }
    public void exibirDetalhes(){
        System.out.println("***** "+this.marca+" "+this.modelo+" *****");
        System.out.println("Potência: " + this.potencia + " cv.");
        System.out.println("Cilindrada: " + this.cilindrada + " cc");
        System.out.println("Ano Fabrico: " + this.anoDeFabrico);
        System.out.println("Tipo Combustivel: " + this.tipoCombustivel);
        System.out.println("Consumo: " + this.consumo100Km + " L/100Km.");
        System.out.println("****************************");


    }


}