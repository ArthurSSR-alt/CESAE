package Ex_06;

public class Calculadora {
    private int num1, num2;

    public Calculadora(int num1,int num2){
        this.num1=num1;
        this.num2=num2;

    }
    public int adicao(){
        return this.num1+num2;

    }
    public int subtracao(){
        return this.num1-num2;

    }
    public int multiplicacao(){
        return this.num1*num2;

    }
    public int divisao(){
        return this.num1/num2;

    }



}
