package be.cegeka.battle;


public class Spear implements Weapon {

    @Override
    public int getDamagePoints(int opponentDamage) {
        return 2;
    };
}
