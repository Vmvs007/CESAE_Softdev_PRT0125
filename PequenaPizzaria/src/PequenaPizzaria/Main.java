package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;
import PequenaPizzaria.Enums.TipoBase;
import PequenaPizzaria.Enums.UnidadeMedida;
import PequenaPizzaria.Ingredientes.Base;
import PequenaPizzaria.Ingredientes.Ingrediente;

public class Main {
    public static void main(String[] args) {

        // Instanciar Ingredientes
        Base baseFina = new Base("B-002","Base Fina de Pão",2, TipoBase.FINA,"Tradicional e boa");

        Ingrediente molhoTomate = new Ingrediente("I-001", "Molho Tomate", UnidadeMedida.LITROS, 250);
        Ingrediente queijoMozzarela = new Ingrediente("I-011", "Queijo Mozzarela", UnidadeMedida.GRAMAS, 1.5);
        Ingrediente cogumelo = new Ingrediente("I-190", "Cogumelo", UnidadeMedida.UNIDADES, 7);
        Ingrediente azeitona = new Ingrediente("I-200", "Azeitona Preta", UnidadeMedida.UNIDADES, 5);
        Ingrediente pepperoni = new Ingrediente("I-211", "Pepperoni", UnidadeMedida.UNIDADES, 15);
        Ingrediente ananas = new Ingrediente("I-900", "Ananás", UnidadeMedida.UNIDADES, 2);
        Ingrediente fiambre = new Ingrediente("I-111","Fiambre",UnidadeMedida.GRAMAS,4);

        // Instanciar Pizzas
        Pizza pizza4EstacoesMedia = new Pizza("P-001", "Pizza 4 Estações", "Inverno, Primavera, Verão e Outono", 12.5, TamanhoPizza.MEDIA);
       pizza4EstacoesMedia.adicionarIngrediente(new IngredientePizza(baseFina,150));
        pizza4EstacoesMedia.adicionarIngrediente(new IngredientePizza(molhoTomate, 0.150));
        pizza4EstacoesMedia.adicionarIngrediente(new IngredientePizza(queijoMozzarela, 160));
        pizza4EstacoesMedia.adicionarIngrediente(new IngredientePizza(cogumelo, 10));
        pizza4EstacoesMedia.adicionarIngrediente(new IngredientePizza(azeitona, 8));
        pizza4EstacoesMedia.adicionarIngrediente(new IngredientePizza(pepperoni, 6));

        pizza4EstacoesMedia.adicionarIngrediente(new IngredientePizza(ananas, 10));

        Pizza pizzaQueijoFiambrePequena = new Pizza("P-010","Queijo e Fiambre","Simples e Eficaz",7.5,TamanhoPizza.PEQUENA);
        pizzaQueijoFiambrePequena.adicionarIngrediente(new IngredientePizza(molhoTomate,0.095));
        pizzaQueijoFiambrePequena.adicionarIngrediente(new IngredientePizza(queijoMozzarela,100));
        pizzaQueijoFiambrePequena.adicionarIngrediente(new IngredientePizza(fiambre,75));


        pizza4EstacoesMedia.exibirDetalhes();
        pizzaQueijoFiambrePequena.exibirDetalhes();

    }
}
