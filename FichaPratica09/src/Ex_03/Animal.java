package Ex_03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double pesoKg;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.alimentacao = alimentacao;
    }

    public boolean comer(String alimento, double pesoG) {

        for (int i = 0; i < this.alimentacao.length; i++) {

            if (this.alimentacao[i].equals(alimento)) {
                // Encontramos a comida que ele gosta. Vai comer
                System.out.println(this.nome + " comeu " + alimento);
                this.pesoKg += pesoG / 1000;
                return true;
            }
        }

        System.out.println(this.nome+" não comeu.");
        return false;

    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.especie + " | País: " + this.paisOrigem + " | Peso: " + this.pesoKg + " Kg.");
    }
}
