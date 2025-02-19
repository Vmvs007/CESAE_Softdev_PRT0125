package Ex_02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Carro mercedes = new Carro("Mercedes", "A45", 2022, 420, 2000, TipoCombustivel.GASOLINA, 15);
        Carro bmw = new Carro("BMW", "116d", 2010, 420, 2000, TipoCombustivel.DIESEL, 10);
        Carro papaReformas = new Carro("Papa", "Reformas", 1972, 1115, 500, TipoCombustivel.DIESEL, 35);
        Carro ferrari = new Carro("Ferrari", "SF90", 2024, 800, 5000, TipoCombustivel.GASOLINA, 25);

        Animal dumbo = new Animal("Elefante", "Dumbo", 500);
        Animal fido = new Animal("Cão", "Fido", 20);

        mercedes.corrida(bmw);
        mercedes.corrida(ferrari);
        dumbo.comer("Erva");

        papaReformas.corrida(ferrari);

        fido.comer("Ração");
        dumbo.comer("Maçã");

        ferrari.ligar();

        ferrari.corrida(bmw);

    }
}
