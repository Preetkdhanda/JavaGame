package Players;

import AttackTypes.TypeOfHealing;
import Behaviours.IHeal;

public class Clerics extends Player implements IHeal {
    private TypeOfHealing typeOfHealing;

    public Clerics(String name, TypeOfHealing typeOfHealing) {
        super(name);
        this.typeOfHealing = typeOfHealing;
    }

    public TypeOfHealing getTypeOfHealing() {
        return typeOfHealing;
    }

    public void setTypeOfHealing(TypeOfHealing typeOfHealing) {
        this.typeOfHealing = typeOfHealing;
    }

    public boolean healInjured(TypeOfHealing typeOfHealing){
        if (this.typeOfHealing.getHealingPower()>0){
           return true;
        }else{
            return false;
        }


    }
}
