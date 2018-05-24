package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<Soldier> soldiers = new ArrayList<>();

    private Soldier soldier;

    private Soldier frontMan;

    public Army() {

    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public void setSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    public Soldier getFrontMan() {
        return frontMan;
    }


    public void setFrontMan(Soldier frontMan) {
        this.frontMan = frontMan;
    }


    public void enrollSoldier(Soldier soldier, Headquarters h) {
        this.soldier = soldier;
        soldiers.add(soldier);
        this.frontMan = soldiers.get(0);
        soldier.setId(h.ReportEnListment(soldier.getName()));

    }
}
