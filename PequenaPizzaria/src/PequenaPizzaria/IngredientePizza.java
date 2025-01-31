package PequenaPizzaria;

import PequenaPizzaria.Ingredientes.Ingrediente;

public class IngredientePizza {
    private Ingrediente ingrediente;
    private double quantidade;

    /**
     * Método construtor para <b>IngredientePizza</b>
     * @param ingrediente Ingrediente
     * @param quantidade Quantidade
     */
    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        this.ingrediente.exibirDetalhes();
        System.out.print(": "+this.quantidade+" "+this.ingrediente.getUnidadeMedidaAbreviada());
    }
}
