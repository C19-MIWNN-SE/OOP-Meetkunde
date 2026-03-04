package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * @author Vincent Velthuizen
 * Houdt de eigenschappen van een cirkel bij
 */
public class Cirkel {
    public static int aantalCirkels = 0;

    public int volgnummer;
    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        volgnummer = ++aantalCirkels;
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        volgnummer = ++aantalCirkels;
        this.straal = straal;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "groen";
    }

    public Cirkel() {
        volgnummer = ++aantalCirkels;
        this.straal = 1;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "groen";
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }
}
