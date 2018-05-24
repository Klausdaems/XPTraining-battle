package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;

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

}