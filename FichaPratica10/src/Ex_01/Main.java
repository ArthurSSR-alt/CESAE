package Ex_01;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Californication", "Rock", "Red Hot Chili Peppers", 7898);
        Musica musica2 = new Musica("Smells Like Teen Spirit", "Rock", "Nirvana", 5234);
        Musica musica3 = new Musica("Highway to Hell", "Rock", "Ac/Dc", 1445);

        MusicPlayer mp = new MusicPlayer();

        mp.addMusica(musica1);
        mp.addMusica(musica2);
        mp.addMusica(musica3);
        mp.addMusica(musica1);

        mp.exibirDetalhes();
        System.out.println("_________________________________");

        mp.trocarMusica(0,2);

        mp.exibirDetalhes();

        System.out.println("_________________________________");
        mp.calcularDuracao();


    }
}
