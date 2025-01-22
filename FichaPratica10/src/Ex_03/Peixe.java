package Ex_03;

/**
 * Classe que define um <b>Peixe</b>
 */
public class Peixe {

    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor de <b>Peixe</b>
     *
     * @param especie Espécie do <b>Peixe</b>
     * @param peso    Peso (Kg.) do <b>Peixe</b>
     * @param precoKg Preço (€) por Kg.
     */
    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    /**
     * Método para exibir os detalhes de um <b>Peixe</b>
     */
    public void exibirDetalhes() {
        System.out.println(this.especie + " | Peso: " + this.peso + " Kg. | Preço/Kg.: " + this.precoKg + " €");
    }
}
