package Animais;

public class Elefante extends Animal{

    public Elefante(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("IIIIIIIIIIIIIIIHHHHHHHHHHHHHH");
    }


}
