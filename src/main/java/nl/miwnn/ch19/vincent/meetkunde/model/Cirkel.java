package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * @author Vincent Velthuizen
 * Houdt de eigenschappen van een cirkel bij
 */
public class Cirkel {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static final int DEFAULT_STRAAL = 1;
    private static final int DEFAULT_MIDDELPUNT_X = 0;
    private static final int DEFAULT_MIDDELPUNT_Y = 0;
    private static final String DEFAULT_KLEUR = "groen";

    private static int aantalCirkels = 0;

    private int volgnummer;
    private double straal;
    private double middelpuntX;
    private double middelpuntY;
    private String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        volgnummer = ++aantalCirkels;

        setStraal(straal);
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        this(straal, DEFAULT_MIDDELPUNT_X, DEFAULT_MIDDELPUNT_Y, DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public static double geefOmtrek(double straal) {
        return 2 * Math.PI * straal;
    }

    public double geefOmtrek() {
        return geefOmtrek(this.straal);
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is niet eerlijk!!!";
        }
    }

    public static int getAantalCirkels() {
        return aantalCirkels;
    }

    public static void resetAantalCirkels() {
        aantalCirkels = 0;
    }

    public int getVolgnummer() {
        return volgnummer;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.err.printf("De straal moet positief zijn. De straal wordt nu op %d gezet.\n", DEFAULT_STRAAL);
            straal = DEFAULT_STRAAL; // bewust alternatief tov het boek
        }
        this.straal = straal;
    }
}
