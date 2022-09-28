import AttackTypes.TypeOfHealing;
import Players.Clerics;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericsTest {

    Clerics cleric;

    @Before
    public void setUp(){
        cleric = new Clerics("Chandler", TypeOfHealing.KISS_OF_LIFE);
    }

    @Test
    public void canHeal(){
        boolean actualValue = cleric.healInjured(TypeOfHealing.KISS_OF_LIFE);
        assertEquals(true, actualValue);
    }

}
