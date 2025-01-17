package Ex_01;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);
        Musica musica4 = new Musica("Eu chu**","Pimbalhada","Rosinha",120);
        Musica musica5 = new Musica("Dialetos de Ternura","Indefinido","Maria Leal",680);

        MusicPlayer mp = new MusicPlayer();

        mp.addMusica(musica1);
        mp.addMusica(musica2);
        mp.addMusica(musica3);
        mp.addMusica(musica4);
        mp.addMusica(musica5);

        mp.imprimirRelatorio();

        System.out.println("\n___________________________________________________________________________\n");

        mp.trocarMusica(1,2);
        mp.imprimirRelatorio();

        System.out.println("\n___________________________________________________________________________\n");

        mp.trocarMusica(musica4,musica5);
        mp.imprimirRelatorio();

        System.out.println("\n___________________________________________________________________________\n");

        mp.removerMusica(1);
        mp.imprimirRelatorio();


        System.out.println("\n___________________________________________________________________________\n");

        System.out.print("Duração: ");
        mp.calcularDuracaoProgramacao();

    }

}
