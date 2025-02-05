package Demonstracao;

public class Cao extends Animal{

    private String raca;

    public Cao(String nome, String cor, double peso, double altura, String raca) {
        super(nome, cor, peso, altura);
        this.raca = raca;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Au au au");
    }
}
