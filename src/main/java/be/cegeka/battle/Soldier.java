package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private Weapon weapon = new BareFist();

    public Soldier(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name mag niet null zijn");
        }
        if (name == "") {
            throw new IllegalArgumentException("Name mag niet leeg zijn");
        }
        if (name.contains(" ")) {
            throw new IllegalArgumentException("Name mag geen spaties hebben");
        }
        Validate.isTrue(isNotBlank(name));

        this.name = name;
    }

    String getName() {
        return this.name;
    }


    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
