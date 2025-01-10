package Ex_09;

public class Main {
    public static void main(String[] args) {

        Produto caneta = new Produto("Caneta BIC Preta",0.5);
        Produto banana = new Produto("Banana da Madeira",1.1);

        caneta.exibirDetalhes();
        banana.exibirDetalhes();

        //_______________________________________________
        System.out.println();

        caneta.comprar(50);
        banana.comprar(2);

        caneta.exibirDetalhes();
        banana.exibirDetalhes();

        //_______________________________________________
        System.out.println();

        caneta.vender(30);
        banana.vender(22);

        caneta.exibirDetalhes();
        banana.exibirDetalhes();
    }
}
