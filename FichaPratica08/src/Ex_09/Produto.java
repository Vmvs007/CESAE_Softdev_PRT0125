package Ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeStock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar(int quantidade) {
        this.quantidadeStock += quantidade; // this.quantidadeStock = this.quantidadeStock + quantidade;
        System.out.println("Adquirido/a " + quantidade + " unidades de " + this.nome);
    }

    public void vender(int quantidade) {

        if (this.quantidadeStock >= quantidade) { // temos stock suficiente
            this.quantidadeStock -= quantidade;
            System.out.println("Vendeu " + quantidade + " unidades de " + this.nome);
        } else { // não temos stock
            System.out.println("Não temos stock suficiente para vender " + quantidade + " unidades de " + this.nome);
        }

    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + this.nome + " | Preço: " + this.preco + " € | Stock: " + this.quantidadeStock);
    }
}
