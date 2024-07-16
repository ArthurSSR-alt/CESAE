package Ex_04;

public class Circulo {
    private double raio;
    private int comprimento;
    private double pi= 3.14;



    public Circulo(double raio, int comprimento){
        this.raio=raio;
        this.comprimento=comprimento;

    }
    //Area = pi*(raio*raio)
    public double area(){
        return this.pi*(this.raio*this.raio);

    }
    //Comprimento = (2*pi)*raio
    public double circunferencia(){
        return (this.pi*this.pi)*this.raio;

    }

    public void pi(){
        System.out.println(this.pi);

    }


}
