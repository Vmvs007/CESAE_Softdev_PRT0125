package Demonstracao;

public class Gato extends Animal{

    public Gato(String nome, String cor, double peso, double altura) {
        super(nome, cor, peso, altura);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Miau!");
    }


}
