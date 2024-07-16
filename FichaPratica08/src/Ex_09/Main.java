package Ex_09;

public class Main {
    public static void main(String[] args) {
        Produto produto1=new Produto("Lasanha", 23, 32);

        produto1.comprar(5);
        System.out.println("Stock: "+produto1.stock);

        produto1.vender(2);
        System.out.println("Stock: "+produto1.stock);

        //criar os produtos e invocar os métodos comprar e vender.




    }
}
