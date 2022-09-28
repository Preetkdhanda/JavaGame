package Rooms;



import AttackTypes.TypeOfEnemy;
import Behaviours.IEnemy;
import Players.Enemy;


public class EnemyRoom implements IEnemy {
    private Enemy enemy;

    public EnemyRoom(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public Enemy getEnemy() {
        return enemy;
    }
}
