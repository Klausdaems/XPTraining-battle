/*
 * package be.cegeka.battle; import static org.assertj.core.api.Assertions.assertThat; import org.junit.Rule; import
 * org.junit.Test; import org.junit.rules.ExpectedException; public class SoldierTest {
 * @Rule public ExpectedException expectedException = ExpectedException.none();
 * @Test public void construction_ASoldierMustHaveAName() { Soldier soldier = new Soldier("name");
 * assertThat(soldier.getName()).isEqualTo("name"); }
 * @Test public void construction_ASoldierMustHaveAName_CannotBeNull() {
 * expectedException.expect(RuntimeException.class); expectedException.expectMessage("Name mag niet null zijn"); new
 * Soldier(null); }
 * @Test() public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
 * expectedException.expect(RuntimeException.class); expectedException.expectMessage("Name mag niet leeg zijn"); new
 * Soldier(""); }
 * @Test() public void construction_ASoldierMustHaveAName_CannotBeBlank() {
 * expectedException.expect(RuntimeException.class); expectedException.expectMessage("Name mag geen spaties hebben");
 * new Soldier("   "); } }
 */
package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArmyTest {

    public ArmyTest() {

    }

    private Army army;

    private Soldier soldier1;

    private Soldier soldier2;

    private Soldier soldier3;

    @Before
    public void maakArmyAan() {
        army = new Army();
    }

    @Before
    public void maakSoldiersAanEnEnoll() {
        soldier1 = new Soldier("Klied", false);
        soldier2 = new Soldier("Lindert", false);
        soldier3 = new Soldier("Stef", false);

        Headquarters headquarters = new Headquarters();

        army.enrollSoldier(soldier1, headquarters);
        army.enrollSoldier(soldier2, headquarters);
        army.enrollSoldier(soldier3, headquarters);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testBekijkOfIedereenSuccesvolToegevoegdIs() {
        Assertions.assertThat(army.getSoldiers().size() == 3);
    }

    @Test
    public void testDatKliedFrontmanIs() {
        Assertions.assertThat(army.getSoldiers().get(0).equals(soldier1));
    }

    @Test
    public void testDatKliedGeenFrontmanIs() {
        Assertions.assertThat(army.getSoldiers().get(0)).isNotEqualTo(soldier2);
    }


}
