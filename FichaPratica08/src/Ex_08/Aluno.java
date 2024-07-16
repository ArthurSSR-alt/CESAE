package Ex_08;

public class Aluno {
    private String nome;
    private String idade;
    private String  curso;
    private double media = 9.5;


    //if (media>=9.5)
//return true
//soutln("Aprovado")
//if(media<9.5)
//soutln("Reprovado")
//return false
    public Aluno(String nome, String idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;

    }
    public void InformacoesDoAluno(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.curso);
        System.out.println(this.media);


    }


    public void situacao (){
        if (media>=9.5){
            System.out.println("Aprovado");

        }if (media<9.5){
            System.out.println("Reprovado");
        }

    }








}