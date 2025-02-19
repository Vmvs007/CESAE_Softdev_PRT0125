package Ex_02.Produtos;

public class Livro extends Produto {

    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibir() {
        System.out.println("Livro: "+this.nome+" | Autor: "+this.autor);
    }


}
