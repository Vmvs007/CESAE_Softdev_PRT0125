public class Animal {
    private String nome;
    private double peso;
    private double altura;

    public Animal(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public void comer() {
        System.out.println(this.nome + " " + " comeu.");
    }
}
