package be.cegeka.battle;


public class Trident extends Spear {

    @Override
    public int getDamagePoints(int opponentDamage) {
        return super.getDamagePoints(opponentDamage) * 3;
    };
}
