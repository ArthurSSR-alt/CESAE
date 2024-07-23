package Pizzaria.PizzariaIngrediente;

import Pizzaria.Pizza;
import Pizzaria.PizzariaEnums.TamanhoPizza;

public class Ingrediente {
    private int codigo;
    private String nome;
    private String unidadeMedida;
    private double nCaloriasPorMedida;


    public Ingrediente(int  codigo, String nome, String unidadeMedida, double nCaloriasPorMedida) {

        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.nCaloriasPorMedida = nCaloriasPorMedida;
    }

    public String getUnidadeMedida() {
        return getUnidadeMedida();
    }
    public int getCodigo(){
        return getCodigo();
    }

    public double getnCaloriasPorMedida() {
        return getnCaloriasPorMedida();
    }

}