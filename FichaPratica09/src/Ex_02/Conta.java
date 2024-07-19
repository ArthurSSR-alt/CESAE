package Ex_02;

public class Conta {
    private String numeroDaConta;
    private double saldo;
    private String titularDaConta;
    private int anoDeAbertura = 2023;

    private double valorEmDivida;

    public Conta(String numeroDaConta, double saldo, String titularDaConta, double valorEmDivida) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titularDaConta = titularDaConta;
        this.valorEmDivida = valorEmDivida;
    }
    public double getMargemEmprestimo(){
        return this.saldo*0.9;

    }


    public boolean pedirEmprestimo(double valorParaEmprestimo) {
        //Avaliar total de emprestimo de acordo com o saldo
        if (valorEmDivida == 0 && valorParaEmprestimo <= this.getMargemEmprestimo()) {
         this.saldo+=valorParaEmprestimo;
         this.valorEmDivida+=valorParaEmprestimo;
            System.out.println("Empréstimo válido.");
            return true;
        }
        return false;



    }

    public void exibirDetalhes(){
        System.out.println("Número da conta: " +this.numeroDaConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Títular da conta: " + this.titularDaConta);
        System.out.println("Ano de abertura: " + this.anoDeAbertura);
        System.out.println("Margem de empréstimo: " + this.getMargemEmprestimo());
        System.out.println("Valor em dívida: " + this.valorEmDivida);
        System.out.println("****************************");



    }


}
