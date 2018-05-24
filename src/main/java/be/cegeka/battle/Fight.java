package be.cegeka.battle;


public class Fight {


    private Soldier attacker;

    private Soldier defender;

    private Soldier winner;


    public Soldier fight(Soldier attacker, Soldier defender) {
        Soldier winner = null;
        int opponentDamage = 0;
        if (attacker.getWeapon().getDamagePoints(opponentDamage) > defender.getWeapon()
            .getDamagePoints(opponentDamage)) {

        }
        Soldier verliezer = null;

        if (attacker.getWeapon().getDamagePoints(opponentDamage) >= defender.getWeapon()
            .getDamagePoints(opponentDamage)) {
            winner = attacker;
            verliezer = defender;
        }

        if (attacker.getWeapon().getDamagePoints(opponentDamage) < defender.getWeapon()
            .getDamagePoints(opponentDamage)) {
            winner = defender;
            verliezer = attacker;
        }


        if (attacker.getWeapon().getDamagePoints(opponentDamage) == defender.getWeapon()
            .getDamagePoints(opponentDamage)) {
            winner = attacker;
        }


        Headquarters h = new Headquarters();
        h.ReportCasualty(verliezer.getId());


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
