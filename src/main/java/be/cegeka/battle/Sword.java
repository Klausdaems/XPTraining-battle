package be.cegeka.battle;


public class Sword implements Weapon {

    @Override
    public int getDamagePoints(int opponentDamage) {
        return 2;
    };
}
