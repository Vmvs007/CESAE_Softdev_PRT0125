package Ex_01.Produtos;

public class Eletronico extends Produto{

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibir() {
        System.out.println("Eletrónico: "+this.nome);
    }
}
