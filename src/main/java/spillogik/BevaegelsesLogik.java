package spillogik;

import ModelEnteties.felter.Felt;

public class BevaegelsesLogik {

    /** Private constructor sikrer at man ikke kan lave objekter af klassen. */
    private BevaegelsesLogik(){}


    /**
     * @author Malte
     * Undersøger om spilleren passerer start, hvis spilleren rykker 'antalFelter'.
     * Den giver ikke noget output om hvor mange gange man passerer start
     * (se i stedet {@link #antalGangeOverStart}), eller
     * hvor meget der udbetales ( se {@link #passererStartPenge(int)}.
     *
     * @param startFelt         Spillerens start position
     * @param antalFelter       Hvor mange felter spilleren rykker frem
     * @param totalAntalFelter  Hvor mange felter der paa braettet i alt
     * @return Om spilleren passerer start eller ej.
     */
    public static boolean passererSpillerStart( int startFelt, int antalFelter, int totalAntalFelter){
        return antalGangeOverStart(startFelt, antalFelter, totalAntalFelter) > 0;
    }


    /**
     * @author Malte
     * Beregner hvor mange gange spilleren passerer start, hvis
     * spilleren rykker 'antalFelter'.
     * Giver ikke noget output om hvor meget man skal have udbetalt
     * (se i stedet {@link #passererStartPenge(int)}
     *
     * @param startFelt         Spillerens start position
     * @param antalFelter       Hvor mange felter spilleren rykker frem
     * @param totalAntalFelter  Hvor mange felter der paa braettet i alt
     * @return                  Antallet af ganget spilleren passerer start
     */
    public static int antalGangeOverStart( int startFelt, int antalFelter, int totalAntalFelter){
        int gangeOverStart  = ( startFelt + antalFelter ) / totalAntalFelter;
        return gangeOverStart;
    }


    /**
     * @author Malte
     * Beregner hvor mange penge man skal have ved passering af start.
     *
     * @param gangeOverStart   Hvor mange gange man passerer start
     * @return Hvor mange penge spilleren skal have
     */
    public static int passererStartPenge( int gangeOverStart ){
        return gangeOverStart * 200;
    }


    /**
     * @author Malte
     * Beregner hvilket felt man lander på hvis man rykker 'antalFelter'.     *
     *
     * @param braet         Liste over alle felterne
     * @param startFelt     Feltet man start paa
     * @param antalFelter   Hvor mange felter man rykker
     * @return              Det felt man ender paa efter at rykke antalFelter
     */
    public static Felt beregnEndeligtFelt(Felt[] braet, Felt startFelt, int antalFelter ){
        int endeligtFeltNr = 0;
        int totalAntalFelter = braet.length;
        int startFeltNr = startFelt.getPlacering();

        if((startFeltNr+antalFelter)*-1>totalAntalFelter) {
            endeligtFeltNr = ((((startFeltNr+antalFelter)+braet.length)%totalAntalFelter)*-1)-totalAntalFelter;
        }
        else if(startFeltNr+antalFelter<0){endeligtFeltNr = (((startFeltNr+antalFelter)+braet.length)+totalAntalFelter);}

        else {
            endeligtFeltNr = (startFeltNr + antalFelter) % totalAntalFelter;
        }

        return braet[endeligtFeltNr];
    }






}
