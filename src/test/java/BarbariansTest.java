import AttackTypes.TypeOfEnemy;
import AttackTypes.TypeOfHealing;
import AttackTypes.TypeOfWeapon;
import Players.Barbarians;
import Players.Clerics;
import Players.Enemy;
import Rooms.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbariansTest {

     Barbarians barbarian;
     EnemyRoom room;
     Enemy enemy;
     Clerics cleric;

     @Before
     public void setUp(){
          barbarian = new Barbarians("Joe", TypeOfWeapon.AXE);
          enemy = new Enemy("Red", TypeOfEnemy.ORC);
          room = new EnemyRoom(enemy);
          cleric = new Clerics("Chandler", TypeOfHealing.KISS_OF_LIFE);
     }
     @Test
     public void hasHealthPoints(){
          assertEquals(20, this.barbarian.getHealth());
     }

     @Test
     public void hasWeapon(){
          assertEquals("Axe", this.barbarian.getTypeOfWeapon().getValue());
     }

     @Test
     public void canFight(){
         boolean actualValue = barbarian.canFight(TypeOfWeapon.AXE, enemy);
          assertEquals(false, actualValue);
     }

     @Test
     public void keepFighting(){
          barbarian.canFight(TypeOfWeapon.AXE, enemy);
          barbarian.keepFighting(TypeOfWeapon.AXE, enemy);
          assertEquals(0, enemy.getHealth());
          assertEquals("Enemy is dead", barbarian.keepFighting(TypeOfWeapon.AXE,enemy));
     }

     @Test
     public void canGetAttacked(){
          barbarian.getAttacked(enemy);
          assertEquals(10, barbarian.getHealth());
     }

     @Test
     public void canHeal(){
          barbarian.getAttacked(enemy);
          barbarian.getHealed(cleric);
          assertEquals(20, barbarian.getHealth());
     }
}
