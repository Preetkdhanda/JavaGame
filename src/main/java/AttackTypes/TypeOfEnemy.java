package AttackTypes;

public enum TypeOfEnemy {
    ORC(10), TROLL(15), WEREWOLF(20);

    private final int value;

    TypeOfEnemy(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
