package Ex_06;

public class Main {
    public static void main(String[] args) {
        Calculadora calculo1= new Calculadora (22, 23);
        System.out.println("Soma: "+calculo1.adicao());
        System.out.println("___________________");
        System.out.println("Próximo cálculo");


        Calculadora calculo2 = new Calculadora(90, 3);
        System.out.println("Subtração: "+calculo2.subtracao());
        System.out.println("___________________");
        System.out.println("Próximo cálculo");


        Calculadora calculo3=new Calculadora(40,2);
        System.out.println("Multiplicação: "+calculo3.multiplicacao());
        System.out.println("___________________");
        System.out.println("Próximo cálculo");


        Calculadora calculo4=new Calculadora(4,2);
        System.out.println("Divisão: "+calculo4.divisao());

        System.out.println("___________________");

        System.out.println("Fim dos cálculos!!");


    }
}
