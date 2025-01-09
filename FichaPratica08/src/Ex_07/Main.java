package Ex_07;

public class Main {
    public static void main(String[] args) {

        Livro programacaoJava = new Livro("Programação em Java: Princípios", "Vitor Santos", "Formação", 650, "12345-123-456");
        Livro aventuraMagica = new Livro("Aventura Mágica", "Joaquim", "Infantil", 50, "56789-567-900");

        programacaoJava.exibirDetalhes();

        System.out.println();

        aventuraMagica.exibirDetalhes();


    }
}
