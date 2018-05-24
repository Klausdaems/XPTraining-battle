package be.cegeka.battle;


public interface IHeadquarters {

    abstract int ReportEnListment(String soldierName);

    abstract void ReportCasualty(int soldierId);

    abstract void ReportVictory(int remainingNumberOfSoldiers);
}
