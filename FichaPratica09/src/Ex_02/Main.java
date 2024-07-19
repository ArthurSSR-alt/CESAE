package Ex_02;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("12345", 1000, "Arthur", 0);
        conta1.exibirDetalhes();
        conta1.pedirEmprestimo(200);
        conta1.exibirDetalhes();


    }
}
