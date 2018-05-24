package be.cegeka.battle;


public class BroadAxe extends Axe {

    @Override
    public int getDamagePoints(int opponentDamage) {
        return super.getDamagePoints(opponentDamage) + 2;
    };
}
