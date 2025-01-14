package Ex_06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Cristiano Ronaldo","Futebol",1.75,70,"Portugal");
        Atleta atleta2 = new Atleta("Lebron James","Basket",2.1,90,"USA");
        Atleta atleta3 = new Atleta("Joaquim A.","Matrecos",1.5,60,"Portugal");
        Atleta atleta4 = new Atleta("Usain Bolt","Atletismo",1.9,75,"Jamaica");

        Competicao corridaCESAE = new Competicao("Corrida CESAE","Portugal",2);
        corridaCESAE.inscreverAtleta(atleta1);
        corridaCESAE.inscreverAtleta(atleta2);
        corridaCESAE.inscreverAtleta(atleta3);
        corridaCESAE.inscreverAtleta(atleta4);

        corridaCESAE.exibirDetalhes();


        System.out.println("\n\n_________________________________________________________\n\n");
        Competicao torneioMatrecos = new Competicao("XI Torneio Matrecos","Espanha",12);
        torneioMatrecos.inscreverAtleta(atleta3);

        torneioMatrecos.exibirDetalhes();

    }
}
