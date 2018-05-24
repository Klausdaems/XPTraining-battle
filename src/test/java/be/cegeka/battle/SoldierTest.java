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
        Soldier soldier = new Soldier("name", false);

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Name mag niet null zijn");
        new Soldier(null, false);
    }

    @Test
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Name mag niet leeg zijn");
        new Soldier("", false);
    }

    @Test
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Name mag geen spaties hebben");
        new Soldier("   ", false);
    }

    @Test
    public void soldierHasBareFist() {
        Soldier soldier = new Soldier("Test", false);

        assertEquals(soldier.getWeapon().getClass(), BareFist.class);
    }

    @Test
    public void soldierHasOtherWeapon() {
        Soldier soldier = new Soldier("Test", false);
        Sword sword = new Sword();
        soldier.setWeapon(sword);

        assertEquals(soldier.getWeapon().getClass(), Sword.class);
    }


    @Test
    public void soldiergetsid() {
        Soldier soldier1 = new Soldier("Test", false);
        Soldier soldier2 = new Soldier("Tester", false);

        Army army = new Army();

        Headquarters headquarters = new Headquarters();

        army.enrollSoldier(soldier1, headquarters);
        army.enrollSoldier(soldier2, headquarters);


        assertEquals(1, soldier1.getId());
        assertEquals(2, soldier2.getId());
    }
}