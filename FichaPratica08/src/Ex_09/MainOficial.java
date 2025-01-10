package Ex_09;

public class MainOficial {
    public static void main(String[] args) {

        Produto ratoPc = new Produto("Rato PC",100);

        ratoPc.comprar(5);

        ratoPc.vender(2);

        ratoPc.exibirDetalhes();

        ratoPc.comprar(10);

        ratoPc.vender(35);

        ratoPc.exibirDetalhes();
    }
}
