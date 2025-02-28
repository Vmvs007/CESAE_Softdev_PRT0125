package Ex_01;

public class MeleeAttackStrategy implements AttackStrategy{

    public MeleeAttackStrategy() {
    }

    @Override
    public void attack() {
        System.out.println("Realizar ataque corpo a corpo");
    }
}
