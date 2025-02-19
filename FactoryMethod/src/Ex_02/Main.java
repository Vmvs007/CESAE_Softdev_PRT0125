package Ex_02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        Livro livro = new Livro("GoF",22.9);
//
//        Roupa camisa = new Roupa("Camisa Azul",50);
//        Roupa calcas = new Roupa("Calças Bege",60);
//
//        Eletronico laptop = new Eletronico("Laptop HP",1000);

        LojaOnline lo = new LojaOnline("Loja TOP");

        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("nome", "GoF");
        mapa.put("preco", "10.5");
        mapa.put("autor", "Quim");

        lo.adicionarProduto(ProdutoFactory.criarProduto("Livro", mapa));

        lo.adicionarProduto(ProdutoFactory.criarProduto("Roupa", Map.of(
                "nome", "T-shirt",
                "preco", "50"
        )));

//        lo.adicionarProduto(ProdutoFactory.criarProduto("Eletronico", "Laptop HP", 1000));
//        lo.adicionarProduto(ProdutoFactory.criarProduto("Comida", "Hamburguer", 10.5));
//        lo.adicionarProduto(ProdutoFactory.criarProduto("Sapatos", "Hamburguer", 10.5));

        lo.listarStock();


    }
}
