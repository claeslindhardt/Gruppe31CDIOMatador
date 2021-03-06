/*
import view.TUI.TUI;
import controller.*;
import view.UserInterface;
import controller.Spiller;
import model.Spil;
import model.felter.ejeligefelter.Ejendom;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SpilCOTest {
    */
/**
     * @auther Andreas
     * Formål: At teste om vi kan passere start og fortsat blive på spillepladen
     * Metode: brættet har 4 felter, spillers, start position er 0 (start), terningværdi er 5.
     * Forventet: spillerplacering efter slag 1.
     * Statur: Testen er godkendt og bestået.
     *//*



    @Test
    void tjekForPasseringAfStartOgRykSpiller() {

        int spillerTur = 1;

        UserInterface pan = new TUI();
        Spil spil = new SpilController(1, 4, 2, 0, pan);


        spil.getTerningeKrus().setTotalVaerdi(3);
        spil.tjekForPasseringAfStartOgRykSpiller(spil.getTerningeKrus());

        int forventetSpillerPosition = 1;
        int aktuelSpillerPosition = spil.getSpillerMedTur().getPosition();
        assertEquals(aktuelSpillerPosition, forventetSpillerPosition);
    }

    */
/**
     * @auther Andreas
     * Formål: At sikre at der kan findes en vinder i spillet.
     * Status: Gennemført. Der kan findes en vinder.
     * Test: Godkendt
     *//*

    @Test
    void tjekForVinder() {

        UserInterface pan = new TUI();
        SpilController spil = new SpilController(3, 4, 2, 0, pan);

        spil.getSpillerObjekter().get(0).setHarGivetOp(true);
        spil.getSpillerObjekter().get(1).setHarGivetOp(true);
        spil.setSpillerTur(3);

        spil.tjekForVinder();
        assertTrue(spil.getVinderFindes());


    }

    */
/**
     * @auther Andreas
     * Formål: At teste om Constructoren i SpilControllerklassen generer, en spiller liste og en liste med feltobjekter.
     * Det forventes at der genereres det indtastede antal spiller.
     * Status: Test gennemført
     * Karatter: Bestået.
     *//*


    @Test
    void Spilcontroller() {
        UserInterface pan = new TUI();

        SpilController spil = new SpilController(3, 20, 2, 0, pan);
        //Her bliver det testet at der bliver oprettet spiller objekter i en liste.
        int count = 0;
        Spiller sp1 = spil.getSpillerObjekter().get(0);
        Spiller sp2 = spil.getSpillerObjekter().get(1);
        Spiller sp3 = spil.getSpillerObjekter().get(2);
        ArrayList<Spiller> spillere = new ArrayList<Spiller>();
        spillere.add(0, sp1);
        spillere.add(1, sp2);
        spillere.add(2, sp3);

        for (int i = 0; i < spil.getSpillerObjekter().size(); i++) {
            assertEquals(spil.getSpillerObjekter().get(i), spillere.get(i));
            // Her testes det at der generes det anatal felter til listen som der er sat som input.
        }

        spil.getAntalFelter();
        int forventetAntalFelter = 20;
        assertEquals(forventetAntalFelter, spil.getAntalFelter());
        assertEquals(forventetAntalFelter, spil.getAntalFelter(), "Der findes det antal felter i listen, som det var ønsket");

    }
        // Her testes det at der bliver genereret forskellige feltertyper
@Test
        void alleFeltTyper(){
        UserInterface pan = new TUI();
        SpilController spil = new SpilController(3, 20, 2, 0, pan);
        int startfelt = 0, ejendom = 0, chancefelt = 0, faengsel = 0, gaaIFaengsel = 0, jernbane = 0, taxi = 0;


        for (int j = 0; j < spil.getBretGeneretForSpil().getBret().size(); j++) {
            if (spil.getBretGeneretForSpil().getBret().get(j) instanceof StartFelt) {
                startfelt++;
            } else if (spil.getBretGeneretForSpil().getBret().get(j) instanceof Ejendom) {
                ejendom++;
            } else if (spil.getBretGeneretForSpil().getBret().get(j) instanceof ProevLykken) {
                chancefelt++;
            } else if (spil.getBretGeneretForSpil().getBret().get(j) instanceof Faengsel) {
                faengsel++;
            } else if (spil.getBretGeneretForSpil().getBret().get(j) instanceof GaaIFaengsel) {
                gaaIFaengsel++;
            } else if (spil.getBretGeneretForSpil().getBret().get(j) instanceof JernbaneCO) {
                jernbane++;
            } else if (spil.getBretGeneretForSpil().getBret().get(j) instanceof TaxiCO) {
                taxi++;
            }

        }
        assertTrue(ejendom > 2);
        assertTrue(startfelt == 1);
        assertTrue(faengsel == 1);
        assertTrue(jernbane > 2);
        assertTrue(taxi == 1);
        assertTrue(gaaIFaengsel == 1);
        assertTrue(chancefelt > 1);

    }

   */
/*@Test
    public void genererSpillere(int antalSpillere) {

        UserInterface pan = new TUI();
        SpilController spil = new SpilController(2, 10, 2, 0, pan);


        for (int i = 0; i < antalSpillere; i++) {
            Spiller deltager = new Spiller(navnInput.nextLine(), i, 0);
            spil.getSpillerObjekter().add(deltager);

        }

    }*//*



   @Test
    void taTaxa(){

   }
}

*/
