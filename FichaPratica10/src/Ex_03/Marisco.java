package Ex_03;

/**
 * Classe que define um <b>Marisco</b>
 */
public class Marisco {

    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor de <b>Marisco</b>
     * @param especie Espécie do <b>Marisco</b>
     * @param peso Peso (Kg.) do <b>Marisco</b>
     * @param precoKg Preço (€) por Kg.
     */
    public Marisco(String especie, double peso, double precoKg) {
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
     * Método para exibir os detalhes de um <b>Marisco</b>
     */
    public void exibirDetalhes() {
        System.out.println(this.especie + " | Peso: " + this.peso + " Kg. | Preço/Kg.: " + this.precoKg + " €");
    }
}
