package Ex_01.Produtos;

public class Roupa extends Produto {

    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibir() {
        System.out.println("Roupa: " + this.nome);
    }


}
