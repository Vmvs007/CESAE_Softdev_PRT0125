package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private String nome;
    private double premio;
    private ArrayList<Pessoa> listaParticipantes;

    public Sorteio(String nome, double premio) {
        this.nome = nome;
        this.premio = premio;
        this.listaParticipantes = new ArrayList<Pessoa>();
    }

    public void inscreverPessoa(Pessoa novoInscrito) {

        if (novoInscrito.getIdade() >= 18) { // Maior de idade
            this.listaParticipantes.add(novoInscrito);
            System.out.println(this.nome + " inscrição aceite: " + novoInscrito.getNome());
        } else { // Menor de idade
            System.out.println(this.nome + " inscrição recusada (menor de idade): " + novoInscrito.getNome());
        }

    }

    public void exibirDetalhes() {
        System.out.println("********** " + this.nome + " | Prémio: " + this.premio + " € **********");
        System.out.println("__ Lista Participantes __");

        for (int i = 0; i < this.listaParticipantes.size(); i++) {
            this.listaParticipantes.get(i).exibirDetalhes();
        }
    }

    public Pessoa sortear(){
        Random rd = new Random();

        int indexVencedor = rd.nextInt(this.listaParticipantes.size());

        return this.listaParticipantes.get(indexVencedor);
    }

}
