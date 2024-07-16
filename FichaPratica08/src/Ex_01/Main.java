package Ex_01;

public class Main {
    public static void main(String[] args) {
 Pessoa arthur = new Pessoa("Arthur", 18, 1.6);
 Pessoa camila = new Pessoa("Camila", 18, 1.6);


        System.out.println("****Informação das pessoas****");
        System.out.println("Nome: "+arthur.getNome());
        System.out.println("Idade: "+arthur.getIdade()+" anos.");
        System.out.println("Altura: "+arthur.getAltura()+" m.");

        System.out.println("__________________________________");

        System.out.println("Nome: "+camila.getNome());
        System.out.println("Idade: "+camila.getIdade()+" anos.");
        System.out.println("Altura: "+camila.getAltura()+" m.");





    }
}
