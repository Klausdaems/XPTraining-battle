package be.cegeka.battle;


public class Axe implements Weapon {

    @Override
    public int getDamagePoints(int opponentDamage) {
        return 3;
    };
}
