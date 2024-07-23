package Ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int segundos;

    public Musica(String titulo, String genero, String artista, int segundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.segundos = segundos;

    }

    public int getSegundos() {
        return segundos;
    }

    public void exibirDetalhes(){
        System.out.println("Título: "+this.titulo+ " | Género: "+this.genero+ " | Artista: "+this.artista+" | Duração: "+this.segundos);

    }


}
