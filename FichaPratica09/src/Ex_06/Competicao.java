package Ex_06;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] listaParticipantes;

    public Competicao(String nome, String pais, int maxParticipantes) {
        this.nome = nome;
        this.pais = pais;
        this.listaParticipantes = new Atleta[maxParticipantes];
    }

    public void inscreverAtleta(Atleta atletaNovo) {

        for (int i = 0; i < this.listaParticipantes.length; i++) {

            if (this.listaParticipantes[i] == null) { // Encontramos uma posição vazia
                this.listaParticipantes[i] = atletaNovo;
                System.out.println("Atleta Inscrito: " + atletaNovo.getNome());
                return;
            }
        }

        System.out.println("Atleta não inscrito porque não vagas: "+atletaNovo.getNome());
    }

    public void exibirDetalhes() {
        System.out.println("********** " + this.nome + " | " + this.pais + " **********");

        for (int i = 0; i < this.listaParticipantes.length && this.listaParticipantes[i] != null; i++) {
            this.listaParticipantes[i].exibirDetalhes();
        }
    }

}
