package Ex_01;

import Ex_01.Enums.CategoriaJato;
import Ex_01.Enums.Instalacao;

import java.util.ArrayList;

public class JatoParticular extends Aviao {

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> listaInstalacoes;

    public JatoParticular(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, alturaCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.listaInstalacoes = new ArrayList<Instalacao>();
    }

    public void adicionarInstalacao(Instalacao instalacaoNova) {
        this.listaInstalacoes.add(instalacaoNova);
    }


    public void demonstracaoLuxo(){
        System.out.println("Este avião é luxo...");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Lotação: "+this.lotacao+" | Cap. Bagagem: "+this.capacidadeBagagem+" cm3 | Categoria: "+this.categoria);
        System.out.println("Instalações: "+this.listaInstalacoes);
    }


}
