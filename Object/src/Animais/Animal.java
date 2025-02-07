package Animais;

public abstract class Animal {
    private String nome;
    private double peso;
    private double altura;

    public Animal(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public abstract void fazerBarulho();

    public String getClassSimpleName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return this.nome + " | Peso: " + this.peso + " Kg. | Altura: " + this.altura + " m.";
    }
}
