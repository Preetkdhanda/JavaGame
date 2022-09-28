package AttackTypes;

public enum TypeOfSpell {
    LIGHTENING_STRIKE(5), FIREBALL(7), ELECTRICBALL(10), DISARM(20);

    private final int damage;

    TypeOfSpell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
