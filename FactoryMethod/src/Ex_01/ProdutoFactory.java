package Ex_01;

import Ex_01.Produtos.*;

public class ProdutoFactory {

    public static Produto criarProduto(String tipoProduto, String nome, double preco) {

        switch (tipoProduto){
            case "Livro":
                return new Livro(nome,preco);

            case "Eletronico":
                return new Eletronico(nome,preco);

            case "Roupa":
                return new Roupa(nome, preco);

            case "Comida":
                return new Comida(nome, preco);

            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: "+tipoProduto);
        }

    }

}
