package Ex_09;

public class Produto {
    private String nome;
    private int preco;
    public int stock = 0;


    public Produto(String nome, int preco, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.stock = stock;

    }

    public int comprar(int quantidadeCompra) {
        if (stock > quantidadeCompra) {
            System.out.println("Compra não autorizada");
        } else {
            System.out.println("Compra autorizada");

        }
        return this.stock + quantidadeCompra;
    }

    public int vender(int quantidadeVenda) {

        System.out.println("Venda concluída");
        return this.stock - quantidadeVenda;

    }




}
