package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * @author Vincent Velthuizen
 * Houdt de eigenschappen van een cirkel bij
 */
public class Cirkel {
    private static int aantalCirkels = 0;

    private int volgnummer;
    private double straal;
    private double middelpuntX;
    private double middelpuntY;
    private String kleur;

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

    public static int getAantalCirkels() {
        return aantalCirkels;
    }

    public int getVolgnummer() {
        return volgnummer;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.err.println("De straal moet positief zijn. De straal wordt nu op 1 gezet.");
            straal = 1; // bewust alternatief tov het boek
        }
        this.straal = straal;
    }
}
