package Behaviours;

import AttackTypes.TypeOfWeapon;
import Players.Enemy;

public interface IFight {
    public boolean canFight(TypeOfWeapon typeOfWeapon, Enemy enemy);
}
