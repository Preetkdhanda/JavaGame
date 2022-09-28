import AttackTypes.*;
import Players.Clerics;
import Players.Enemy;
import Players.Warlocks;
import Rooms.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlocksTest {

    private Warlocks warlock;
    private Enemy enemy;
    private EnemyRoom room;
    private Clerics cleric;

    @Before
    public void setUp() {
        warlock = new Warlocks("Red", TypeOfSpell.ELECTRICBALL, TypeOfCreature.UNICORN);
        enemy = new Enemy("Chandler", TypeOfEnemy.ORC);
        room = new EnemyRoom(enemy);
        cleric = new Clerics("Joey", TypeOfHealing.KISS_OF_LIFE);
    }

    @Test
    public void canFight(){
        boolean actualValue = warlock.canFight(TypeOfSpell.ELECTRICBALL, enemy);
        assertEquals(false, actualValue);
    }

    @Test
    public void canKeepFighting(){
        warlock.castSpell(TypeOfSpell.ELECTRICBALL, enemy);
        assertEquals(0, enemy.getHealth());
        assertEquals("Enemy is dead", warlock.castSpell(TypeOfSpell.ELECTRICBALL, enemy));
    }


    @Test
    public void canGetAttacked(){
        warlock.getAttacked(enemy);
        assertEquals(10,warlock.getHealth());
    }
    @Test
    public void canHeal(){
        warlock.getAttacked(enemy);
        warlock.getHealed(cleric);
        assertEquals(20, warlock.getHealth());
    }
}
