package be.cegeka.battle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FightTest {

    @Test
    public void soldierGetDamageFromWeapon() {
        int opponentDamage = 0;
        Soldier soldier = new Soldier("Test", false);
        Sword sword = new Sword();
        soldier.setWeapon(sword);

        assertEquals(soldier.getWeapon().getDamagePoints(opponentDamage), sword.getDamagePoints(opponentDamage));
    }

    @Test
    public void soldierFight() {
        Soldier attacker = new Soldier("Test", false);
        Soldier defender = new Soldier("Tester", false);
        Sword sword = new Sword();
        BareFist bareFist = new BareFist();
        attacker.setWeapon(sword);
        defender.setWeapon(bareFist);

        Fight fight = new Fight();
        fight.setAttacker(attacker);
        fight.setDefender(defender);


        assertEquals(attacker, fight.fight(attacker, defender));
    }


    @Test
    public void soldierFightWithSameWeapons() {
        Soldier attacker = new Soldier("Test", false);
        Soldier defender = new Soldier("Tester", false);
        Sword sword = new Sword();
        attacker.setWeapon(sword);
        defender.setWeapon(sword);

        Fight fight = new Fight();
        fight.setAttacker(attacker);
        fight.setDefender(defender);


        assertEquals(attacker, fight.fight(attacker, defender));
    }

    @Test
    public void oppponentsWeaponHasEvenDamage() {
        int opponentDamage = 0;
        Soldier attacker = new Soldier("Test", false);
        Soldier defender = new Soldier("Tester", false);
        Sword sword = new Sword();
        MagicPotion magicPotion = new MagicPotion();
        attacker.setWeapon(magicPotion);
        defender.setWeapon(sword);

        Fight fight = new Fight();
        fight.setAttacker(attacker);
        fight.setDefender(defender);

        assertEquals(attacker.getWeapon().getDamagePoints(defender.getWeapon().getDamagePoints(opponentDamage)), 10);

    }
}
