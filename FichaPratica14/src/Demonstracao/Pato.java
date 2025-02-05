package Demonstracao;

public class Pato extends Animal{

    public Pato(String nome, String cor, double peso, double altura) {
        super(nome, cor, peso, altura);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Quack! Quack!");
    }


}
