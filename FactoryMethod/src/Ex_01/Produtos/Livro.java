package Ex_01.Produtos;

public class Livro extends Produto{

    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibir() {
        System.out.println("Livro: "+this.nome);
    }


}
