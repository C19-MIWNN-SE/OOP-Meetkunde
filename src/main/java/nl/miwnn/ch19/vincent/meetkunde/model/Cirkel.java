package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * @author Vincent Velthuizen
 * Houdt de eigenschappen van een cirkel bij
 */
public class Cirkel extends Figuur {
    private static final int DEFAULT_STRAAL = 1;

    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        setAttributen(straal, middelpunt);
    }

    public Cirkel(double straal) {
        super();
        setAttributen(straal, new Punt());
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

    @Override
    public double geefOmtrek() {
        return geefOmtrek(straal);
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return straal * 2 <= lengte && straal * 2 <= breedte;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                    Straal: %.2f
                    Middelpunt: %s""",
                super.toString().replace("figuur", "cirkel"),
                this.straal,
                this.middelpunt);
    }

    private void setAttributen(double straal, Punt middelpunt) {
        setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            throw new IllegalArgumentException(
                    String.format("Een straal van %s is niet toegestaan, de straal moet positief zijn.", straal));
        }
        this.straal = straal;
    }
}
