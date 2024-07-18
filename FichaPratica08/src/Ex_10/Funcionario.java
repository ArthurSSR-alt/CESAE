package Ex_10;

public class Funcionario {
    String nome;
    double salario;
    String departamento;

    public Funcionario(String nome, double salario, String departamento){
        this.nome=nome;
        this.salario=salario;
        this.departamento=departamento;

    }
    public void aumentarSalario (double aumento){
       this.salario+=(salario*aumento/100);



    }

    public void exibirDados (){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
        System.out.println("Departamento: "+this.departamento);


    }




}
