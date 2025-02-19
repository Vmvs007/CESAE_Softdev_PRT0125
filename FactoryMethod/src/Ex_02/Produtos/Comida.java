package Ex_02.Produtos;

public class Comida extends Produto {
    public Comida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibir() {
        System.out.println("Comida: " + this.nome);
    }


}
