package be.cegeka.battle;


public class Trident implements Weapon {

    @Override
    public int getDamagePoints() {
        Spear spear = new Spear();
        return 3 * spear.getDamagePoints();
    };
}
