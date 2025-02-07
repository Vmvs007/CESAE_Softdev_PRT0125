import Animais.Elefante;
import Animais.Leao;

public class Main {
    public static void main(String[] args) {

        Elefante dumbo = new Elefante("Dumbo",800,3.5);
        Leao simba = new Leao("Simba",250,1.9);

        System.out.println(dumbo);
        System.out.println(simba.getClassSimpleName());


    }
}