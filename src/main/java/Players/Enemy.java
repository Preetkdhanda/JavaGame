package Players;

import AttackTypes.TypeOfEnemy;

public class Enemy extends Player {

    private TypeOfEnemy typeOfEnemy;

    public Enemy(String name, TypeOfEnemy typeOfEnemy) {
        super(name);
        this.typeOfEnemy = typeOfEnemy;
    }

    public TypeOfEnemy getTypeOfEnemy() {
        return typeOfEnemy;
    }

    public void setTypeOfEnemy(TypeOfEnemy typeOfEnemy) {
        this.typeOfEnemy = typeOfEnemy;
    }


}
