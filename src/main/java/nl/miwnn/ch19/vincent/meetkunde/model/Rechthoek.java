package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * @author Vincent Velthuizen
 * Houdt de eigenschappen van een rechthoek bij
 */
public class Rechthoek extends Figuur {

    private static final double DEFAULT_LENGTE = 1.0;
    private static final double DEFAULT_BREEDTE = 1.0;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksboven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksboven, String kleur) {
        super(kleur);
        setAttributen(lengte, breedte, hoekpuntLinksboven);
    }

    public Rechthoek(double lengte, double breedte) {
        super();
        setAttributen(lengte, breedte, new Punt());
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                    Lengte: %.2f
                    Breedte: %.2f
                    Hoekpunt linksboven: %s""",
                super.toString().replace("figuur", "rechthoek"),
                this.lengte,
                this.breedte,
                this.hoekpuntLinksboven);
    }

    private void setAttributen(double lengte, double breedte, Punt hoekpuntLinksboven) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksboven = hoekpuntLinksboven;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }
}
