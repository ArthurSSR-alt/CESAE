package Ex_11;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("12345",2000,"Arthur");
        Conta conta2 = new Conta("54321",2000,"Camila");
        Conta conta3 = new Conta("12654",2000,"Cadu");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("«««««««««««...»»»»»»»»»»»");


        System.out.println("Depositando..");
        conta1.depositar(20);
        conta3.depositar(300);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        System.out.println("«««««««««««...»»»»»»»»»»»");

        conta1.levantar(200);
        conta3.levantar(500);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        System.out.println("«««««««««««...»»»»»»»»»»»");

        conta1.transferencia(200,conta2);
        conta2.transferencia(400,conta3);

        System.out.println("«««««««««««...»»»»»»»»»»»");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();



    }
}
