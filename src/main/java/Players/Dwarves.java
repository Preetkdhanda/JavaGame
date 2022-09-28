package Players;

import AttackTypes.TypeOfWeapon;
import Behaviours.IFight;
import Behaviours.IWeapon;

public class Dwarves extends Player implements IFight, IWeapon {

    private TypeOfWeapon typeOfWeapon;

    public Dwarves(String name, TypeOfWeapon typeOfWeapon) {
        super(name);
        this.typeOfWeapon = typeOfWeapon;
    }

    public TypeOfWeapon getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(TypeOfWeapon typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    @Override
    public boolean  canFight(TypeOfWeapon typeOfWeapon, Enemy enemy) {
        return typeOfWeapon.getDamage() >= enemy.getHealth();
    }
}
