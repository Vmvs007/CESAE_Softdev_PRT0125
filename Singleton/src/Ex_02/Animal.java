package Ex_02;

import java.io.IOException;

public class Animal {
    private String especie;
    private String nome;
    private double pesoKg;

    public Animal(String especie, String nome, double pesoKg) {
        this.especie = especie;
        this.nome = nome;
        this.pesoKg = pesoKg;
    }

    public void comer(String comida) throws IOException {

        Logger logger = Logger.getInstance("log_animal.txt");

        System.out.println(this.nome + " comeu " + comida);
        this.pesoKg++;

        logger.log(this.especie+" "+this.nome+" comeu "+comida+". Ficou com "+this.pesoKg+" Kg.");
    }
}
