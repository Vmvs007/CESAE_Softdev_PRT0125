package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    /**
     * Método que permite adicionar uma nova Música à programação
     *
     * @param musicaNova Música que vai ser adicionada
     */
    public void addMusica(Musica musicaNova) {
        this.programacao.add(musicaNova);
    }

    /**
     * Método para trocar uma Música (recebe uma nova e a respetiva posição onde vai ser inserida)
     *
     * @param numeroMusica Número para a Música a ser substituida (index + 1)
     * @param musicaNova   Música que vai ser adicionada
     */
    public void trocarMusica(int numeroMusica, Musica musicaNova) {
        this.programacao.set(numeroMusica - 1, musicaNova);
    }

    /**
     * Método para trocar duas Músicas de posição
     *
     * @param numeroMusica1 Número da primeira música (index + 1)
     * @param numeroMusica2 Número da segunda música (index + 1)
     */
    public void trocarMusica(int numeroMusica1, int numeroMusica2) {

        Musica musicaIndex1 = this.programacao.get(numeroMusica1 - 1);
        Musica musicaIndex2 = this.programacao.get(numeroMusica2 - 1);

        this.programacao.set(numeroMusica1 - 1, musicaIndex2);
        this.programacao.set(numeroMusica2 - 1, musicaIndex1);

    }

    /**
     * Método para trocar duas Músicas de posição
     *
     * @param musica1 Primeira música a trocar
     * @param musica2 Segunda música a trocar
     */
    public void trocarMusica(Musica musica1, Musica musica2) {

        int index1 = this.programacao.indexOf(musica1);
        int index2 = this.programacao.indexOf(musica2);

        this.programacao.set(index1, musica2);
        this.programacao.set(index2, musica1);
    }

    /**
     * Método para remover uma música pelo seu numero
     *
     * @param numeroMusicaRemovida Número da Música a ser removida (index + 1)
     */
    public void removerMusica(int numeroMusicaRemovida) {
        this.programacao.remove(numeroMusicaRemovida - 1);
    }

    /**
     * Método para remover uma música
     *
     * @param musicaRemovida Música a ser removida
     */
    public void removerMusica(Musica musicaRemovida) {
        this.programacao.remove(musicaRemovida);
    }

    public void limparProgramacao() {
        this.programacao.clear();
    }

    public void calcularDuracaoProgramacao() {

        // Calcular total de segundos da programação
        int totalSegundos = 0;

        for (Musica musicaAtual : this.programacao) {
            totalSegundos += musicaAtual.getDuracaoSegundos();
        }

        int horas, minutos, segundos;

        horas = totalSegundos / 3600;
        minutos = (totalSegundos / 60) - (horas * 60);
        segundos = totalSegundos - (horas * 3600) - (minutos * 60);

        System.out.println(horas+"h "+minutos+"m "+segundos+"s");

    }

    /**
     * Método para imprimir todas as Músicas na programação
     */
    public void imprimirRelatorio() {

        int contadorMusicas = 1;

        for (Musica musicaAtual : this.programacao) {
            System.out.print("Música " + contadorMusicas++ + ": ");
            musicaAtual.exibirDetalhes();
        }
    }
}
