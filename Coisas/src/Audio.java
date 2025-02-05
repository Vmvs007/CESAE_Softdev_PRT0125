import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    /**
     * Método para correr ficheiros áudio durante a execução do programa
     * *     * @param caminho Caminho para o ficheiro áudio
     */
    public static void playMusic(String caminho) {
        try { // Bloco try para envolver o código que pode potencialmente lançar uma excepção
            File audio = new File(caminho);
            if (audio.exists()) { // Se encontrar o ficheiro
                // Instanciar objecto do tipo bAudioInputStream(bibliotecas importadas acima) com o ficheiro áudio passado como parâmetro
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audio);
                Clip clip = AudioSystem.getClip(); // Instanciar objecto do tipo Clip
                clip.open(audioInput); // Abre o ficheiro
                clip.start(); // Corre o ficheiro
            } else { // Se não encontrar o ficheiro
                // NOTA: Aqui poderia inserir uma mensagem a informar o utilizador que o ficheiro de áudio não foi encontrado.
                // Contudo, achei melhor não mostrar nada caso não exista ficheiro.
                // Como existe excepção, o programa não dá erro e continua a correr, mas sem áudio.
            }
        } catch (Exception e) { // Código a ser executado se for detectado erro
            System.out.println();
        }
    }
}