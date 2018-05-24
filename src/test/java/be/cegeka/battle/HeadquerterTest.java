package be.cegeka.battle;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HeadquerterTest {

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
        army1 = new Army("test1");
        army2 = new Army("test2");
    }

    @Test
    public void attackerissterker() {

    }
}
