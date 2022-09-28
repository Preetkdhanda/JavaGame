package Players;

import AttackTypes.TypeOfCreature;
import AttackTypes.TypeOfSpell;

import Behaviours.ICreature;
import Behaviours.ISpell;

public class Warlocks extends Player implements ICreature, ISpell {

    private TypeOfSpell typeOfSpell;
    private TypeOfCreature typeOfCreature;

    private Enemy enemy;

    public Warlocks(String name, TypeOfSpell typeOfSpell, TypeOfCreature typeOfCreature) {
        super(name);
        this.typeOfSpell = typeOfSpell;
        this.typeOfCreature = typeOfCreature;
    }

    public TypeOfSpell getTypeOfSpell() {
        return typeOfSpell;
    }

    public void setTypeOfSpell(TypeOfSpell typeOfSpell) {
        this.typeOfSpell = typeOfSpell;
    }

    public TypeOfCreature getTypeOfCreature() {
        return typeOfCreature;
    }

    public void setTypeOfCreature(TypeOfCreature typeOfCreature) {
        this.typeOfCreature = typeOfCreature;
    }

    public boolean canFight(TypeOfSpell typeOfspell, Enemy enemy) {
        return typeOfspell.getDamage() >= enemy.getHealth();}


    public int defendPlayer(TypeOfCreature typeOfCreature){
            if (getHealth() < 10) {
                this.gainHealth(typeOfCreature.getProtection());
            } return this.getHealth();
    }


    public String castSpell (TypeOfSpell typeOfSpell, Enemy enemy){
                if (canFight(typeOfSpell, enemy) == false) {
                    while (enemy.getHealth() > 0) {
                        enemy.takeDamage(typeOfSpell.getDamage());}
                    } return "Enemy is dead";

    }
    public void getAttacked(Enemy enemy){

        this.takeDamage(enemy.getTypeOfEnemy().getValue());
    }

    public void getHealed(Clerics cleric){
        this.gainHealth(cleric.getTypeOfHealing().getHealingPower());
    }


}
