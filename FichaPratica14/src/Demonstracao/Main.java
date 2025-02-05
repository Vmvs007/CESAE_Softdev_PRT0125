package Demonstracao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cao bobby = new Cao("Bobby", "Preto", 50, 1.1, "Doberman");
        Cao rex = new Cao("Rex", "Branco", 25, 0.8, "Caniche");

        Gato tareco = new Gato("Tareco", "Castanho", 20, 0.5);
        Gato zelda = new Gato("Zelda", "Verde", 10, 0.4);

        Pato donald = new Pato("Donald", "Branco", 60, 1.7);

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(bobby);
        zoo.add(tareco);
        zoo.add(rex);
        zoo.add(donald);
        zoo.add(zelda);


        // Peso Total
        double pesoTotal = 0;
        for (Animal animalAtual : zoo) {
            pesoTotal += animalAtual.getPeso();
        }

        System.out.println("Peso Total dos Animais Todos: " + pesoTotal + " Kg.");


        // Fazer uma festa
        for(Animal animalAtual: zoo){
            animalAtual.fazerBarulho();
        }


    }
}
