package Players;

abstract public class Player {
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void gainHealth(int value){
        this.health += value;
    }
    public void takeDamage(int value){
        this.health -= value;
    }
}
