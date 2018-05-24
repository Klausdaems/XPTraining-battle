package be.cegeka.battle;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WarTest {

    Soldier soldier1;

    Soldier soldier2;

    Army army1;

    Army army2;

    Headquarters headquarters = new Headquarters();


    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void maakAan() {
        soldier1 = new Soldier("test", false);
        soldier2 = new Soldier("test2", false);
        army1 = new Army();
        army2 = new Army();
    }

    @Test
    public void attackerissterker() {


        army1.enrollSoldier(soldier1, headquarters);
        army2.enrollSoldier(soldier2, headquarters);

        new War().soldierbattlefield(army1, army2);


        assertTrue(army1.getSoldiers().get(0).equals(soldier2));
        // assertTrue(army2.getSoldiers().size() == 0);
    }

}
