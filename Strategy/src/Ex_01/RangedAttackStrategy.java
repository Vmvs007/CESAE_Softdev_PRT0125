package Ex_01;

public class RangedAttackStrategy implements AttackStrategy{

    public RangedAttackStrategy() {
    }

    @Override
    public void attack() {
        System.out.println("Realizar ataque à distância");
    }
}
