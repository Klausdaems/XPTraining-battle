package be.cegeka.battle;


public class MagicPotion implements Weapon {

    @Override
    public int getDamagePoints(int opponentDamage) {
        int damage = 0;

        if ((opponentDamage & 1) == 0) {
            damage = 10;
        } else {
            damage = 0;
        }
        return damage;

    };
}

