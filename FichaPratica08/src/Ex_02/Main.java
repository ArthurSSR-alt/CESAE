package Ex_02;

public class Main {
    public static void main(String[] args) {
        Cao rex = new Cao ("Rex", Racas.CARAMELO);
        Cao max = new Cao ("Max", Racas.DALMATA);

        rex.ladrar();
        max.ladrar();

        System.out.println("___________________________");

        rex.setLatido("RRRRRRRRRRRRRRRRRRRR");

        rex.ladrar();
        max.ladrar();

    }
}
