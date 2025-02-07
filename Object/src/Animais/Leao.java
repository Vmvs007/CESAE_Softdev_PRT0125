package Animais;

public class Leao extends Animal{

    public Leao(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("RAUURRR");
    }


}
