package Ex_07;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Pequeno Principe","Arthur","Aventura",200, "01234567");
        System.out.println("Informações pedidas: ");
        livro1.exibirDetalhes();

        System.out.println("____________________");

        Livro livro2 = new Livro("Viagem ao centro da terra","Leo","Aventura",526,"225422452");
        System.out.println("Informações pedidas: ");
        livro2.exibirDetalhes();



    }
}
