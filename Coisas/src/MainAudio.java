import static java.lang.Thread.sleep;

public class MainAudio {
    public static void main(String[] args) throws InterruptedException {
        Audio.playMusic("AudioFiles/super_mario_theme.wav");
        Audio.playMusic("AudioFiles/sonic_ring_effect.wav");

        sleep(3000);

        Audio.playMusic("AudioFiles/sonic_ring_effect.wav");

        sleep(3000);

        System.out.println("Obrigado");
    }
}