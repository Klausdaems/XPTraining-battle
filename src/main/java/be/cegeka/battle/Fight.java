package be.cegeka.battle;


public class Fight {


    private Soldier attacker;

    private Soldier defender;

    private Soldier winner;


    public Soldier fight(Soldier attacker, Soldier defender) {
        Soldier winner = null;

        if (attacker.getWeapon().getDamagePoints() >= defender.getWeapon().getDamagePoints()) {
            winner = attacker;
        }

        if (attacker.getWeapon().getDamagePoints() < defender.getWeapon().getDamagePoints()) {
            winner = defender;
        }


        Headquarters h = new Headquarters();
        h.ReportCasualty(winner.getId());

        return winner;
    }


    public Soldier getAttacker() {
        return attacker;
    }


    public void setAttacker(Soldier attacker) {
        this.attacker = attacker;
    }


    public Soldier getDefender() {
        return defender;
    }


    public void setDefender(Soldier defender) {
        this.defender = defender;
    }


    public Soldier getWinner() {
        return winner;
    }


    public void setWinner(Soldier winner) {
        this.winner = winner;
    }

}
