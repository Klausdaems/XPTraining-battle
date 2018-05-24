package be.cegeka.battle;


public class BareFist implements Weapon {

    @Override
    public int getDamagePoints(int opponentDamage) {
        return 1;
    }
}
