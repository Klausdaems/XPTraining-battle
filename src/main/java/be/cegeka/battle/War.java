package be.cegeka.battle;

import java.util.List;

public class War {

    public War() {

    }

    public void soldierbattlefield(Army attackers, Army defenders) {

        Fight fight = new Fight();

        while (!attackers.getSoldiers().isEmpty() && !defenders.getSoldiers().isEmpty()) {

            Soldier winner = fight.fight(attackers.getSoldiers().get(0), defenders.getSoldiers().get(0));
            if (winner == attackers.getSoldiers().get(0)) {
                List<Soldier> lostarmy = defenders.getSoldiers();
                lostarmy.remove(0);
                defenders.setSoldiers(lostarmy);
            } else {
                List<Soldier> lostarmy = attackers.getSoldiers();
                lostarmy.remove(0);
                attackers.setSoldiers(lostarmy);
            }

        }

    }

}
