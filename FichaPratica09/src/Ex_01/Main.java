package Ex_01;

public class Main {
    public static void main(String[] args) {
        Carro mercedes = new Carro("Mercedes", "A45", 2022, 420, 2000, TipoCombustivel.GASOLINA, 15);
        Carro bmw = new Carro("BMW", "116d", 2010, 420, 2000, TipoCombustivel.DIESEL, 10);
        Carro papaReformas = new Carro("Papa", "Reformas", 1972, 1115, 500, TipoCombustivel.DIESEL, 35);
        Carro ferrari = new Carro("Ferrari","SF90",2024,800,5000,TipoCombustivel.GASOLINA,25);

        // Corrida 1
        System.out.println("***** Corrida 1 *****");
        mercedes.exibirDetalhes();
        System.out.println("VS");
        bmw.exibirDetalhes();

        mercedes.ligar();
        bmw.ligar();

        Carro vencedor1= mercedes.corrida(bmw);

        System.out.print("\nGanhou: ");
        vencedor1.exibirDetalhes();
        System.out.println("________________________________________");
        System.out.println("***** Corrida 2 *****");
        papaReformas.exibirDetalhes();
        System.out.println("VS");
        ferrari.exibirDetalhes();


        // Corrida 2
        papaReformas.ligar();
        ferrari.ligar();

        Carro vencedor2 = papaReformas.corrida(ferrari);

        System.out.print("\nGanhou: ");
        vencedor2.exibirDetalhes();
        System.out.println("________________________________________");

        // Corrida final
        System.out.println("***** Corrida Final *****");
        vencedor1.exibirDetalhes();
        System.out.println("VS");
        vencedor2.exibirDetalhes();

        Carro vencedorFinal = vencedor1.corrida(vencedor2);

        System.out.print("\nGanhou: ");
        vencedorFinal.exibirDetalhes();

        System.out.println("________________________________________");

    }
}
