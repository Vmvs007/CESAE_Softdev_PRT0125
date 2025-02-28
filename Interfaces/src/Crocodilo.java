public class Crocodilo extends Animal implements Terrestre,Aquatico{

    public Crocodilo(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public void nadar() {
        System.out.println("O Crocodilo está a nadar");
    }

    @Override
    public void mergulhar() {
        System.out.println("O Crocodilo está a mergulhar");
    }

    @Override
    public void correr() {
        System.out.println("O Crocodilo está a correr");
    }

    @Override
    public void escalar() {
        System.out.println("O Crocodilo está a escalar");
    }

    @Override
    public void rastejar() {
        System.out.println("O Crocodilo está a rastejar");
    }
}
