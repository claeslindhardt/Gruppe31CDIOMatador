package model;

import model.chancekort.Chancekort;
import model.felter.aktionsfelter.Faengsel;
import model.felter.Felt;
import model.raflebaeger.RafleBaeger;

import java.util.ArrayList;


/**
 * Klassen der indeholder alle informationer omkring et spil.
 */
public class Spil {



    private Spiller[] spillere;
    private RafleBaeger rafleBaeger;
    private Felt[] felter;
    private ArrayList<Chancekort> chanceKort = new ArrayList<>();

    private int spillerTur = 1;


    public ArrayList<Chancekort> getChanceKort() {
        return chanceKort;
    }

    public void setChancekort(ArrayList<Chancekort> chanceKort) {
        this.chanceKort = chanceKort;
    }

    public void addChancekort(Chancekort chancekort ){
        this.chanceKort.add(chancekort);
    }

    public int getSpillerTur() {
        return spillerTur;
    }

    public void setSpillerTur(int spillerTur) {
        this.spillerTur = spillerTur;
    }

    public Spiller[] getSpillere() {
        return spillere;
    }

    public void setSpillere(Spiller ... spillere) {
        this.spillere = spillere;
    }


    public RafleBaeger getRaflebaeger() {
        return rafleBaeger;
    }

    public void setRaflebaeger(RafleBaeger rafleBaeger) {
        this.rafleBaeger = rafleBaeger;
    }


    public Felt[] getFelter() {
        return felter;
    }

    public void setFelter(Felt[] felter) {
        this.felter = felter;
    }


    public int getAntalSpillere(){
        return spillere.length;
    }

    public Spiller getSpiller( int spillerIndex ){
        return spillere[spillerIndex];
    }

    public Spiller getSpillerMedTur(){
        return spillere[ spillerTur-1 ];
    }


    /**
     * Finder fængsel feltet i listen over felter, og returnere det.
     * @author Malte
     * @return Faengselfeltet på gui'en.
     */
    public Faengsel getFaengsel(){
        for( Felt felt : felter ){

            if(  felt instanceof Faengsel){
                return (Faengsel) felt;
            }
        }
        return null;
    }

}
