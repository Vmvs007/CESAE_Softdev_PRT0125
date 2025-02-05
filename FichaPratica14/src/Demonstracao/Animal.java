package Demonstracao;

public abstract class Animal {
    private String nome;
    private String cor;
    private double peso;
    private double altura;

    public Animal(String nome, String cor, double peso, double altura) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public abstract void fazerBarulho();
}
