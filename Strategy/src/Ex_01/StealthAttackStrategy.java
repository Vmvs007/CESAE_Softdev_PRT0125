package Ex_01;

public class StealthAttackStrategy implements AttackStrategy{

    public StealthAttackStrategy() {
    }

    @Override
    public void attack() {
        System.out.println("Realizar ataque silencioso");
    }
}
