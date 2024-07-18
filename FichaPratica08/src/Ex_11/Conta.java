package Ex_11;

public class Conta {
   private String  numeroDaConta;
    private double saldo;
   private String titularDaConta;

    public Conta(String numeroDaConta, double saldo, String titularDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titularDaConta = titularDaConta;
    }
    public void transferencia (double valorTransferencia, Conta contaDestino){
        if (this.saldo>= valorTransferencia)
            this.saldo-= valorTransferencia;
        contaDestino.saldo+=valorTransferencia;



    }
    //aumentar saldo
    public double depositar(double valor){
        return this.saldo+=valor;

    }

    //diminuir saldo
    public void levantar(double valorLevantamento){
        if (this.saldo>=valorLevantamento)


            this.saldo-= valorLevantamento;
    }

    //exibir saldo
public void exibirSaldo(){
    System.out.println(this.saldo);
}

public void exibirDetalhes(){
    System.out.println("_____________________________________________________");
    System.out.println("Núm.Conta: "+this.numeroDaConta+ "| Títular: "+this.titularDaConta+ "| Saldo: "+this.saldo);


    }





}
