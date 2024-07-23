package Pizzaria;

import Pizzaria.PizzariaEnums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> ingredientes;

    public Pizza(int codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientePizza>();
    }

    public int calcularIngredientesAtuais() {
        int ingredientesAtuais = 0;
        for (IngredientePizza ingredientePizza : this.ingredientes) {
            ingredientesAtuais += ingredientePizza.getQuantiadade();
        }
        return ingredientesAtuais;
    }


    public void addIngrediente(IngredientePizza ingredienteNovo) {
        if (this.calcularIngredientesAtuais() + ingredienteNovo.getQuantiadade() <= this.MAX_INGREDIENTES) ;
    }

    public void removerIngrediente(IngredientePizza ingredienteRemover) {
        for (int i = 0; i < ingredientes.size(); i++) {
            this.ingredientes.remove(ingredienteRemover.getIngrediente().getCodigo());
        }
    }

    public void setQuantidade(double id, double quantidadeEditada) {
        //2. Editar a quantidade de um ingrediente que pertença à coleção de uma pizza.
        for (IngredientePizza ingredientePizza: ingredientes){
            if (ingredientePizza.getIngrediente().getCodigo()==codigo){
                ingredientePizza.setQuantidade();
                return;
            }
        }

    }

    public int calcularCalPorMedida() {
        int caloriaAtual = 0;
        for (IngredientePizza caloriaCalculada : this.ingredientes) {
            caloriaAtual *= caloriaCalculada.getIngrediente().getnCaloriasPorMedida() * caloriaCalculada.getQuantiadade();
        }
        return caloriaAtual;
    }

}
