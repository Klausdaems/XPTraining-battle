package be.cegeka.battle;


public class BroadAxe implements Weapon {

    @Override
    public int getDamagePoints() {
        Axe axe = new Axe();
        return 2 + axe.getDamagePoints();
    };
}
