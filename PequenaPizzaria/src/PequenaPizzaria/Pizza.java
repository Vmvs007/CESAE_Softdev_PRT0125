package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;
import PequenaPizzaria.Ingredientes.*;

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

        if (ingredientePizzaNovo.getIngrediente() instanceof Base && this.listaIngredientes.isEmpty()) {
            this.listaIngredientes.add(ingredientePizzaNovo);
        }

        if (ingredientePizzaNovo.getIngrediente() instanceof Topping && this.listaIngredientes.size() > 0 && this.listaIngredientes.size() < this.MAX_INGREDIENTES) {
            this.listaIngredientes.add(ingredientePizzaNovo);
        }

    }

    public void removerIngrediente(String codigoRemover) {

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {

            if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoRemover)) { // Encontramos o IngredientePizza que queremos remover

                if (ingredientePizzaAtual.getIngrediente() instanceof Topping && this.listaIngredientes.size() > 2) {
                    this.listaIngredientes.remove(ingredientePizzaAtual);
                    return;
                }
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

    public String getTipoPizza() {
        int contadorCarne = 0;
        int contadorVegetal = 0;
        int contadorQueijo = 0;
        int contadorFrutosMar = 0;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {

            if (ingredientePizzaAtual.getIngrediente() instanceof Carne) {
                contadorCarne++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Vegetal) {
                contadorVegetal++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Queijo) {
                contadorQueijo++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof FrutoMar) {
                contadorFrutosMar++;
            }
        }

        if (contadorCarne > 0 && contadorVegetal == 0 && contadorQueijo == 0 && contadorFrutosMar == 0) {
            return "Carne";
        } else if (contadorCarne == 0 && contadorVegetal > 0 && contadorQueijo == 0 && contadorFrutosMar == 0) {
            return "Vegetarian";
        } else if (contadorCarne == 0 && contadorVegetal == 0 && contadorQueijo > 0 && contadorFrutosMar == 0) {
            return "Queijo";
        } else if (contadorCarne == 0 && contadorVegetal == 0 && contadorQueijo == 0 && contadorFrutosMar > 0) {
            return "Marisco";
        } else if (contadorCarne > 0 && contadorVegetal > 0 && contadorQueijo > 0 && contadorFrutosMar > 0) {
            return "Completa";
        } else {
            return "Mista";
        }


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

        System.out.println("Kcal Totais: " + this.calcularKcal() + " Kcal.\n");
    }


}
