package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * @author Vincent Velthuizen
 * Algemene eigenschappen die elk figuur heeft
 */
public abstract class Figuur implements Comparable<Figuur> {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static final String DEFAULT_KLEUR = "paars";

    private String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een verzameling punten.";
    }

    public abstract double geefOmtrek();
    public abstract double geefOppervlakte();

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is niet eerlijk!!!";
        }
    }

    @Override
    public int compareTo(Figuur andereFiguur) {
        if (this.geefOppervlakte() < andereFiguur.geefOppervlakte()) {
            return -1;
        } else if (this.geefOppervlakte() > andereFiguur.geefOppervlakte()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("""
                        Dit is een figuur met de volgende eigenschappen:
                            Kleur: %s
                            Omtrek: %.2f
                            Oppervlakte: %.2f""",
                kleur,
                geefOmtrek(),
                geefOppervlakte());
    }

    public String getKleur() {
        return kleur;
    }
}
