package be.cegeka.battle;


public class TwoHandedSword implements Weapon {

    @Override
    public int getDamagePoints(int opponentDamage) {
        return 5;
    };
}
