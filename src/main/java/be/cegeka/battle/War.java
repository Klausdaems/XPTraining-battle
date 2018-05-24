package be.cegeka.battle;

import java.util.List;

public class War {

    public War() {

    }

    public void soldierbattlefield(Army attackers, Army defenders, Headquarters headquarters) {

        Fight fight = new Fight();

        while (!attackers.getSoldiers().isEmpty() && !defenders.getSoldiers().isEmpty()) {

            Soldier winner = fight.fight(attackers.getSoldiers().get(0), defenders.getSoldiers().get(0));
            if (winner == attackers.getSoldiers().get(0)) {
                List<Soldier> lostarmy = defenders.getSoldiers();
                headquarters.ReportCasualty(lostarmy.get(0).getId());
                lostarmy.remove(0);
                defenders.setSoldiers(lostarmy);
            } else {
                List<Soldier> lostarmy = attackers.getSoldiers();
                headquarters.ReportCasualty(lostarmy.get(0).getId());
                lostarmy.remove(0);
                attackers.setSoldiers(lostarmy);
            }

        }

        if (attackers.getSoldiers().isEmpty()) {
            headquarters.ReportVictory(defenders.getSoldiers().size());
        } else {
            headquarters.ReportVictory(attackers.getSoldiers().size());
        }

    }

}
