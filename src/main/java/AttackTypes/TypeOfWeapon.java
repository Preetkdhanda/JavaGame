package AttackTypes;

public enum TypeOfWeapon {
    SWORD("Sword",5), AXE("Axe",5), BOW_ARROW("Bow & Arrows",10), CLUB("Club",20);

    private final String value;
    private final int damage;

    TypeOfWeapon(String value, int damage) {
        this.value = value;
        this.damage = damage;
    }

    public String getValue() {
        return value;
    }

    public int getDamage() {
        return damage;
    }
}
