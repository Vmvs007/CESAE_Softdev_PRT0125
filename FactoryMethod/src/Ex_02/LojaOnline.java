package Ex_02;

import Ex_02.Produtos.Produto;

import java.util.ArrayList;

public class LojaOnline {
    private String nome;
    private ArrayList<Produto> stock;

    public LojaOnline(String nome) {
        this.nome = nome;
        this.stock= new ArrayList<>();
    }

    public void adicionarProduto(Produto produtoNovo){
        this.stock.add(produtoNovo);
    }

    public void listarStock(){
        for(Produto produtoAtual: this.stock){
            produtoAtual.exibir();
        }
        System.out.println("Total: "+this.totalStock()+" €");
    }

    public double totalStock(){
        double total=0;

        for(Produto produtoAtual: this.stock){
            total+=produtoAtual.getPreco();
        }

        return total;
    }
}
