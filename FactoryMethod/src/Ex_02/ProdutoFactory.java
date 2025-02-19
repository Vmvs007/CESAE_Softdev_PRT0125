package Ex_02;

import Ex_02.Produtos.*;

import java.util.HashMap;
import java.util.Map;

public class ProdutoFactory {

    public static Produto criarProduto(String tipoProduto, Map<String,String> mapaAtributos) {

        switch (tipoProduto){
            case "Livro":
                return new Livro(mapaAtributos.get("nome"),Double.parseDouble(mapaAtributos.get("preco")),mapaAtributos.get("autor"));

            case "Eletronico":
                return new Eletronico(mapaAtributos.get("nome"),Double.parseDouble(mapaAtributos.get("preco")));

            case "Roupa":
                return new Roupa(mapaAtributos.get("nome"),Double.parseDouble(mapaAtributos.get("preco")));

            case "Comida":
                return new Comida(mapaAtributos.get("nome"),Double.parseDouble(mapaAtributos.get("preco")));

            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: "+tipoProduto);
        }

    }

}
