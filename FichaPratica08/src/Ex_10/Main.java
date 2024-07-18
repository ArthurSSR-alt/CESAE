package Ex_10;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Arthur",100,"Corpo De Bombeiros");
        System.out.println("Exibir Detalhes: ");
        funcionario1.exibirDados();
        System.out.println("______________________");
        funcionario1.aumentarSalario(10);
        System.out.println("Salário: ");
        funcionario1.exibirDados();


    }
}
