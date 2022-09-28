package AttackTypes;

public enum TypeOfCreature {
    OGRE(5), DRAGON(5), SNAKE(5), UNICORN(10);

    private final int protection;

    TypeOfCreature(int protection) {
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }
}
