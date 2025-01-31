package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {

    private final int MAX_INGREDIENTES = 5;
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> listaIngredientes;

    public Pizza(String codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaIngredientes = new ArrayList<IngredientePizza>();
    }

    public void adicionarIngrediente(IngredientePizza ingredientePizzaNovo) {

        if (this.listaIngredientes.size() < this.MAX_INGREDIENTES) {
            this.listaIngredientes.add(ingredientePizzaNovo);
        }
    }

    public void removerIngrediente(String codigoRemover) {

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {

            if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoRemover)) { // Encontramos o IngredientePizza que queremos remover
                this.listaIngredientes.remove(ingredientePizzaAtual);
                return;
            }

        }
    }

    public void editarIngrediente(String nomeEditar, double novaQuantidade) {

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {

            if (ingredientePizzaAtual.getIngrediente().getNome().equals(nomeEditar)) { // Encontramos o IngredientePizza que queremos editar
                ingredientePizzaAtual.setQuantidade(novaQuantidade);
                return;
            }
        }
    }

    public double calcularKcal() {
        double kcalTotais = 0;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            kcalTotais += ingredientePizzaAtual.getQuantidade() * ingredientePizzaAtual.getIngrediente().getKcal();
        }
        return kcalTotais;
    }

    public void exibirDetalhes() {
        System.out.println("***** " + this.nome + " *****");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + " €");
        System.out.println("Tamanho: " + this.tamanho);

        int contador = 1;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            System.out.print("Ingrediente " + contador++ + ": ");
            ingredientePizzaAtual.exibirDetalhes();
            System.out.println();
        }

        System.out.println("Kcal Totais: "+this.calcularKcal()+" Kcal.\n");
    }
}
