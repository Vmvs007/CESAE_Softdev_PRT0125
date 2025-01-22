package Ex_01;

import Ex_01.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, alturaCauda, numMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public void adicionarArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            this.arsenal.add(armaNova);
            System.out.println(super.modelo + " carregado com " + armaNova);
        } else {
            System.out.println(super.modelo + " já tem o arsenal cheio. Não carregamos com " + armaNova);
        }
    }

    public void vooRaso() {
        System.out.println(this.modelo + " fez um voo raso... VUUUUMMMMMMMMMM");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("País Origem: " + this.paisOrigem + " | Camuflagem: " + this.camuflagem);
        System.out.println("Arsenal: " + this.arsenal);
    }


}
