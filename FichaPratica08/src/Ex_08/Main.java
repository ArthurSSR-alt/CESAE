package Ex_08;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 =new Aluno("Camila", "18","Arquitetura",20);
        System.out.println("Informações do aluno: ");
        aluno1.InformacoesDoAluno();

        System.out.print("Situação: ");
        aluno1.situacao();

        System.out.println("____________________________");
        System.out.println();
        Aluno aluno2 = new Aluno("Arthur","18","SoftDev",20);
        System.out.println("Informações do aluno: ");
        aluno2.InformacoesDoAluno();


        System.out.print("Situação: ");
        aluno2.situacao();



    }
}
