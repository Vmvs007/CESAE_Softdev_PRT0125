package Ex_01;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> listaAvioes;

    public Catalogo() {
        this.listaAvioes = new ArrayList<Aviao>();
    }

    public void adquirirAviao(Aviao aviaoNovo){
        this.listaAvioes.add(aviaoNovo);
    }

    public void exibirDetalhes(){
        for(Aviao aviaoAtual: this.listaAvioes){
            aviaoAtual.exibirDetalhes();
            System.out.println();

            if(aviaoAtual instanceof JatoParticular){
                JatoParticular jatoAtual = (JatoParticular) aviaoAtual;
                jatoAtual.demonstracaoLuxo();
            }

            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.vooRaso();
            }

        }
    }
}
