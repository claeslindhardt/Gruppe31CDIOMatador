package Controller;

import ModelEnteties.Spiller.SpillerController;
import ModelEnteties.Terning.RafleBaeger;
import ModelEnteties.braet.SpilleBraetController;
import ModelEnteties.braet.controllerKlasser.*;
import ModelEnteties.chanceKort.dataKlasser.ChanceAktion;

import java.util.ArrayList;

public interface UserInterfaceKontrakt {
    int TurMenu(int getSpillerTur);
    void ikkeMuligt();
    int velkomstMenu();
    void opretteInstillinger(int getAntalSpillere,int getAntalFelter,int getAntalTerninger,int getSpillerTur,int getBankeraadGraense);
    void startSpilGrundFejl();
    int instilingsSporgsmaal0();
    int instilingsSporgsmaall();
    int instilingsSporgsmaal2();
    int instilingsSporgsmaal3();
    void spillerPosition(int spillerPosition);
    void bankeRaadtGrundetLiquditet(int getBankeraadGraense);
    void spillerUdgår(int udgaaetSpiller);
    void terminalLinje();
    void midtTerminalLinje();
    void vinder(int vinder);
    void anketStraffeDom(int spillerTur);
    void harSlaaetMedTerningfor();
    void ingenHeldIRetten();
    void heldIRetten();
    void retsTerninger(int domsAfsigelseDel1, int domsAfsigelseDel2);
    void spilletErSlut();
    void spillerRykkerGrundetTerningslag(RafleBaeger terningsKrus, int spillerTur);
    void printTerninger(RafleBaeger terningsKrus);
    void ensTerninger();
    void printFaenselInfo();
    void paaBesoegIFaengsel();
    int vilDuGiveOp();
    void takForSpillet();
    void duGavIkkeOp();
    void passeringAfStart(int gangeOverStart);
    void chanceKortHar();
    void chanceKortNr(int i, SpillerController spiller);
    int chanceKortsVejledning();
    void ingenChanceKort();
    int hvorHen(int pos);
    void holdDigPaaBrettet();
    void overStart(int pos);
    void spillerStat(SpillerController spiller);
    void alleredeEjer();
    void dinJernbane();
    void monetosMangel();
    void taxiInfo(Taxi vogn);
    void overStartAnimation();
    void startsFeltsInfo(Start felt);
    void iFaengselMedDig();
    void faengselInfo(GaaIFaengsel Faengsel);
    void muligeDestinationer();
    void jernBaneInfo(Jernbane stadtion);
    int stationsMuligheder();
    void turEfterJernbane();
    void manglerJernbaner();
    int jernBaneTilbud();
    void forsetTur();
    void ejetAfEnAnden();
    void tetPaaMonopol();
    void chanceFeltsInfo(ChanceFeltCO felt);
    void gennemfortKoeb();
    void ejendomsInfo(EjendomCO ej);
    void betalRente();
    void duErLandetPå();
    void badErrorMessage();
    int ejendomsBud();
    void spillerEjendele(SpillerController spiller);
    void bretPrinter(String felt);
    void terminalLine();
    void chanceKortGenereringsFejl();
    void printChanceKortDirekte(ChanceAktion di);
    void chanceKortTilføjet();
    void chanceKortBrugt();
    void brugtUdAfFaengsel();
    void byggetHus(EjendomCO ejendom);
    void ejerIngenEjendomme();
    void ejerIngenBebyggeligeEjendomme();
    int input_EjendomAtByggePaa(ArrayList<EjendomCO> ejendomme);
    void generGUIBret(int AntalFelter, SpilleBraetController bret, ArrayList<SpillerController> spillerObjekter);
    void spillerNavne(int AntalSpillere);
}
