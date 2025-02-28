package Ex_01;

public class Unit {

    private String name;
    private int health;
    private int strength;
    private AttackStrategy selectedAttackStrategy;

    public Unit(String name, int health, int strength, AttackStrategy selectedAttackStrategy) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.selectedAttackStrategy = selectedAttackStrategy;
    }

    public void setSelectedAttackStrategy(AttackStrategy selectedAttackStrategy) {
        this.selectedAttackStrategy = selectedAttackStrategy;
    }

    public void performAttack(){
        this.selectedAttackStrategy.attack();
    }
}
