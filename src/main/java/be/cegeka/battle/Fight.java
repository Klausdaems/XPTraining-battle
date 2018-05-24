package be.cegeka.battle;


public class Fight {


    public Soldier fight(Soldier attacker, Soldier defender) {
        Soldier winner = null;

        if (attacker.getWeapon().getDamagePoints() > defender.getWeapon().getDamagePoints()) {
            winner = attacker;
        }

        if (attacker.getWeapon().getDamagePoints() < defender.getWeapon().getDamagePoints()) {
            winner = defender;
        }
        Headquarters h = new Headquarters();
        h.ReportCasualty(winner.getId());
        return winner;
    }

}
