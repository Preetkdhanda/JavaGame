package Players;

import AttackTypes.TypeOfWeapon;
import Behaviours.IFight;
import Behaviours.IWeapon;

public class Barbarians extends Player implements IFight, IWeapon {
    private TypeOfWeapon typeOfWeapon;
    private Enemy enemy;

    public Barbarians(String name, TypeOfWeapon typeOfWeapon) {
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
    public boolean canFight(TypeOfWeapon typeOfWeapon, Enemy enemy) {
       return typeOfWeapon.getDamage() >= enemy.getHealth();

    }

    public String keepFighting(TypeOfWeapon typeOfWeapon, Enemy enemy){
        if (canFight(typeOfWeapon, enemy) == false){
            while (enemy.getHealth() > 0) {enemy.takeDamage(typeOfWeapon.getDamage()); }
        } return "Enemy is dead";
    }

    public void getAttacked(Enemy enemy){

        this.takeDamage(enemy.getTypeOfEnemy().getValue());
    }

    public void getHealed(Clerics cleric){
        this.gainHealth(cleric.getTypeOfHealing().getHealingPower());
    }
}
