package Ex_03;

public class Main {

    public static void main(String[] args) {

        Animal dumbo = new Animal("Dumbo", "Elefante", "Quénia", 800, new String[]{"Erva", "Fruta", "Palha"});
        Animal simba = new Animal("Simba", "Leão", "África do Sul", 250, new String[]{"Carne"});

        dumbo.exibirDetalhes();
        simba.exibirDetalhes();
        System.out.println();

        //____________________________________________________________

        dumbo.comer("Fruta",1000);
        simba.comer("Fruta",500);

        dumbo.exibirDetalhes();
        simba.exibirDetalhes();
        System.out.println();

        //____________________________________________________________

        dumbo.comer("Carne",1000);
        simba.comer("Carne",500);

        dumbo.exibirDetalhes();
        simba.exibirDetalhes();
        System.out.println();

    }
}
