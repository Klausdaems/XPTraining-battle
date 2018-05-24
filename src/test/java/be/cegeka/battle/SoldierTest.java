package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SoldierTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Name mag niet null zijn");
        new Soldier(null);
    }

    @Test()
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Name mag niet leeg zijn");
        new Soldier("");
    }

    @Test()
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Name mag geen spaties hebben");
        new Soldier("   ");
    }

    @Test()
    public void soldierHasBareFist() {
        Soldier soldier = new Soldier("Test");

        assertEquals(soldier.getWeapon().getClass(), BareFist.class);
    }

    @Test()
    public void soldierHasOtherWeapon() {
        Soldier soldier = new Soldier("Test");
        Sword sword = new Sword();
        soldier.setWeapon(sword);

        assertEquals(soldier.getWeapon().getClass(), Sword.class);
    }

    @Test()
    public void soldierGetDamageFromWeapon() {
        Soldier soldier = new Soldier("Test");
        Sword sword = new Sword();
        soldier.setWeapon(sword);

        assertEquals(soldier.getWeapon().getDamagePoints(), sword.getDamagePoints());
    }

    @Test()
    public void soldierFight() {
        Soldier attacker = new Soldier("Test");
        Soldier defender = new Soldier("Tester");
        Sword sword = new Sword();
        BareFist bareFist = new BareFist();
        attacker.setWeapon(sword);
        defender.setWeapon(bareFist);

        Fight fight = new Fight();
        fight.setAttacker(attacker);
        fight.setDefender(defender);


        assertEquals(attacker, fight.fight(attacker, defender));
    }


    @Test()
    public void soldierFightWithSameWeapons() {
        Soldier attacker = new Soldier("Test");
        Soldier defender = new Soldier("Tester");
        Sword sword = new Sword();
        attacker.setWeapon(sword);
        defender.setWeapon(sword);

        Fight fight = new Fight();
        fight.setAttacker(attacker);
        fight.setDefender(defender);


        assertEquals(attacker, fight.fight(attacker, defender));
    }
}