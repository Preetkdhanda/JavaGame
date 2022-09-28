package Behaviours;

import AttackTypes.TypeOfSpell;
import Players.Enemy;

public interface ISpell {
    public String castSpell(TypeOfSpell typeOfSpell, Enemy enemy);
}
