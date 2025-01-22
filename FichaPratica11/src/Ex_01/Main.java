package Ex_01;

import Ex_01.Enums.Arma;
import Ex_01.Enums.CategoriaJato;
import Ex_01.Enums.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatoParticular cessna = new JatoParticular(12345, "Ibiza", 2005, 1500, 12, 6, 1.5, 2, 2200, 675, 10000, 8, 500, CategoriaJato.LIGHT_JET);
        cessna.adicionarInstalacao(Instalacao.WC);
        cessna.adicionarInstalacao(Instalacao.WIFI);
        cessna.adicionarInstalacao(Instalacao.TOMADAS);

        JatoParticular gulfstream = new JatoParticular(11223, "Leon", 2012, 1450, 13.5, 6.9, 1.8, 2, 2900, 780, 15000, 10, 1000, CategoriaJato.MIDSIZE_JET);
        gulfstream.adicionarInstalacao(Instalacao.WC);
        gulfstream.adicionarInstalacao(Instalacao.SUITE);
        gulfstream.adicionarInstalacao(Instalacao.WIFI);
        gulfstream.adicionarInstalacao(Instalacao.CINEMA);
        gulfstream.adicionarInstalacao(Instalacao.COZINHA);

        JatoParticular boeing = new JatoParticular(99887, "747", 2020, 8800, 30, 12.5, 2.3, 4, 5200, 980, 50000, 90, 6000, CategoriaJato.HEAVY_JET);
        boeing.adicionarInstalacao(Instalacao.WC);
        boeing.adicionarInstalacao(Instalacao.WC);
        boeing.adicionarInstalacao(Instalacao.WIFI);
        boeing.adicionarInstalacao(Instalacao.TOMADAS);

        AviaoCombate f16 = new AviaoCombate(101, "F16", 2015, 900, 6.5, 4, 1, 1, 1650, 1200, 20000, "USA", false);
        f16.adicionarArma(Arma.FOGUETES);
        f16.adicionarArma(Arma.METRALHADORAS);

        AviaoCombate ac147 = new AviaoCombate(200, "C147", 1999, 6500, 25, 8.5, 2, 4, 8000, 900, 19500, "China", true);
        ac147.adicionarArma(Arma.BOMBAS);
        ac147.adicionarArma(Arma.METRALHADORAS);
        ac147.adicionarArma(Arma.TORPEDOS);
        ac147.adicionarArma(Arma.FOGUETES);

        Catalogo ct = new Catalogo();
        ct.adquirirAviao(cessna);
        ct.adquirirAviao(gulfstream);
        ct.adquirirAviao(boeing);
        ct.adquirirAviao(f16);
        ct.adquirirAviao(ac147);

        ct.exibirDetalhes();

    }
}
