package Ex_03;

import java.util.ArrayList;

/**
 * Classe que define um <b>Barco de Pesca</b>. Pode pescar <b>Peixe</b> e <b>Marisco</b>
 */
public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int numTripulantes;
    private double capacidadeCarga;
    private MarcaBarco marca;
    private ArrayList<Peixe> peixePescado;
    private ArrayList<Marisco> mariscoPescado;

    /**
     * Método construtor de <b>Barco</b>
     *
     * @param nome            Nome do <b>Barco</b>
     * @param cor             Cor do <b>Barco</b>
     * @param anoFabrico      Ano de Fabrico
     * @param numTripulantes  Número de Tripulantes
     * @param capacidadeCarga Capacidade da Carga (Kg.)
     * @param marca           Marca do <b>Barco</b>
     */
    public BarcoPesca(String nome, String cor, int anoFabrico, int numTripulantes, double capacidadeCarga, MarcaBarco marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.numTripulantes = numTripulantes;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixePescado = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    /**
     * Método para pescar <b>Peixe</b>
     *
     * @param peixeNovo <b>Peixe</b> que acabou de ser pescado
     */
    public void pescarPeixe(Peixe peixeNovo) {

        if (peixeNovo.getPeso() + this.getCargaAtual() <= this.capacidadeCarga) {
            this.peixePescado.add(peixeNovo);
            System.out.println("Pescou " + peixeNovo.getPeso() + " Kg. de " + peixeNovo.getEspecie());
        } else {
            System.out.println(this.nome + " não tem capacidade para armazenar " + peixeNovo.getPeso() + " Kg. de " + peixeNovo.getEspecie());

        }

    }

    /**
     * Método para pescar <b>Marisco</b>
     *
     * @param mariscoNovo <b>Marisco</b> que acabou de ser pescado
     */
    public void pescarMarisco(Marisco mariscoNovo) {

        if (mariscoNovo.getPeso() + this.getCargaAtual() <= this.capacidadeCarga) {
            this.mariscoPescado.add(mariscoNovo);
            System.out.println("Pescou " + mariscoNovo.getPeso() + " Kg. de " + mariscoNovo.getEspecie());
        } else {
            System.out.println(this.nome + " não tem capacidade para armazenar " + mariscoNovo.getPeso() + " Kg. de " + mariscoNovo.getEspecie());

        }

    }


    /**
     * Método que calcula a carga atual (de <b>Peixe</b> e <b>Marisco</b>)
     *
     * @return Peso (Kg.) que o <b>Barco</b> tem armazenado no momento
     */
    public double getCargaAtual() {
        double cargaTotal = 0;

        for (Peixe peixeAtual : this.peixePescado) {
            cargaTotal += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaTotal += mariscoAtual.getPeso();
        }

        return cargaTotal;
    }

    /**
     * Método para largar <b>Peixe</b>
     *
     * @param peixeRemovido <b>Peixe</b> a ser largado
     */
    public void largarPeixe(Peixe peixeRemovido) {
        this.peixePescado.remove(peixeRemovido);
        System.out.println("Largou " + peixeRemovido.getPeso() + " Kg. de " + peixeRemovido.getEspecie());
    }

    /**
     * Método para largar <b>Marisco</b>
     *
     * @param mariscoRemovido <b>Marisco</b> a ser largado
     */
    public void largarMarisco(Marisco mariscoRemovido) {
        this.mariscoPescado.remove(mariscoRemovido);
        System.out.println("Largou " + mariscoRemovido.getPeso() + " Kg. de " + mariscoRemovido.getEspecie());
    }

    /**
     * Método que calcula o valor (€) da carga atual do <b>Barco</b>
     *
     * @return Valor (€)
     */
    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Peixe peixeAtual : this.peixePescado) {
            valorTotal += peixeAtual.getPeso() * peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            valorTotal += mariscoAtual.getPeso() * mariscoAtual.getPrecoKg();
        }

        return valorTotal;
    }

    /**
     * Método para exibir os detalhes de um <b>Barco</b>
     */
    public void exibirDetalhes() {
        System.out.println("\n_*_*_*_*_*_*_*_*_*_*_*_ " + this.nome + " _*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println(this.cor + " | Ano Fabrico: " + this.anoFabrico + " | " + this.marca);
        System.out.println("Tripulação: " + this.numTripulantes + " | Cap. Carga: " + this.capacidadeCarga + " Kg.");

        System.out.println("\n______________________ Carga de Peixe ______________________");
        for (Peixe peixeAtual : this.peixePescado) {
            peixeAtual.exibirDetalhes();
        }

        System.out.println("\n______________________ Carga de Marisco ____________________");
        for (Marisco mariscoAtual : this.mariscoPescado) {
            mariscoAtual.exibirDetalhes();
        }

        System.out.println("\nCarga Atual: " + this.getCargaAtual() + " Kg.");
        System.out.println("Valor Atual da Carga: " + this.calcularValorTotal() + " €");
        System.out.println("Salário Tripulação: " + this.salarioTripulacao() + " €");

        System.out.println();
    }

    /**
     * Método para calcular quanto é que cada tripulante recebe de salário
     *
     * @return Salário Individual (€)
     */
    public double salarioTripulacao() {
        return (this.calcularValorTotal() * 0.6) / this.numTripulantes;
    }

}
