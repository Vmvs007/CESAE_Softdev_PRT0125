package Ex_01;

public class Main {
    public static void main(String[] args) {

        Unit vitor = new Unit("Vitor",100,50,new MagicAttackStrategy());
        vitor.performAttack();

        vitor.setSelectedAttackStrategy(new RangedAttackStrategy());
        vitor.performAttack();

        vitor.setSelectedAttackStrategy(new StealthAttackStrategy());
        vitor.performAttack();
    }
}
