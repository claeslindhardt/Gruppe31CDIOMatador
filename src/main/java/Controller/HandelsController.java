package Controller;

import BoundaryView.UserInterfaceKontrakt;
import ModelEnteties.felter.EjendomCO;
import spillogik.EjendomsLogik;

public class HandelsController {



    public void indsamleLeje(EjendomCO ejendom,SpillerCO spilleren, UserInterfaceKontrakt userInterfaceKontrakt){
        SpillerCO ejeren = ejendom.getEjer();
        if( ejeren != null && spilleren != null) {
            //todo: enkapsuler dette på en ordenligt måde
            int lejeForFelt = EjendomsLogik.beregnLejeTotal(ejendom,spilleren.ejerEjendomsGruppe(ejendom.getGruppe()));
            spilleren.setPenge(spilleren.getPenge());
            ejeren.addPenge(ejendom.getLeje());  // hvis Spiller ikke har nok penge til at betale skal den have mulighed for at pantsætte
            userInterfaceKontrakt.updateSpillere(spilleren);
        }else{
            userInterfaceKontrakt.badErrorMessage();
        }
    }


}
