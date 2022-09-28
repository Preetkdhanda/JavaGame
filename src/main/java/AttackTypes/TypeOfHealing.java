package AttackTypes;

public enum TypeOfHealing {
    POTION(5), HERBS(7), KISS_OF_LIFE(10);

    private final int healingPower;

    TypeOfHealing(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
