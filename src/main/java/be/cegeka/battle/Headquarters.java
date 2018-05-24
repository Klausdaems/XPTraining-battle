package be.cegeka.battle;


public class Headquarters implements IHeadquarters {

    public Headquarters() {

    }

    private int id = 0;

    @Override
    public int ReportEnListment(String soldierName) {
        id++;
        return id;
    }


    @Override
    public void ReportCasualty(int soldierId) {

    }

    @Override
    public void ReportVictory(int remainingNumberOfSoldiers) {

    }


}
