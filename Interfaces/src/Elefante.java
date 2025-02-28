public class Elefante extends Animal implements Terrestre{

    public Elefante(String especie, double peso, double altura) {
        super(especie, peso, altura);
    }

    @Override
    public void correr() {
        System.out.println("O Elefante está a correr");
    }

    @Override
    public void escalar() {
        System.out.println("O Elefante está a escalar");
    }

    @Override
    public void rastejar() {
        System.out.println("O Elefante está a rastejar");
    }
}
