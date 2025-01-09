package Ex_02;

public class Cao {

    // Atributos de instância
    private String nome;
    private String raca;
    private String latido = "Au au au";

    // Método(s) construtor
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos de acesso (getters e setters)
    public void setLatido(String latido) {
        this.latido = latido;
    }

    // Métodos de instância
    public void ladrar() {
        System.out.println(this.latido);
    }

    public void ladrar(int quantidadeVezes) {
        for (int i = 0; i < quantidadeVezes; i++) {
            System.out.println(this.latido);
        }
    }

}
