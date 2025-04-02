import java.util.concurrent.TransferQueue;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Animal){
            // O objeto que recebemos é um Animal

            Animal animalComparado = (Animal) obj;

            if(this.nome.equals(animalComparado.nome) && this.especie.equals(animalComparado.especie) && this.idade==animalComparado.idade){
                return true;
            }

        }

        return false;
    }
}
