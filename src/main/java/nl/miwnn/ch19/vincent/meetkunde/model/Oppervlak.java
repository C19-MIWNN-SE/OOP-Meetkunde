package nl.miwnn.ch19.vincent.meetkunde.model;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Een rechthoek die meerdere figuren kan bevatten
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> figuren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.figuren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        figuren.add(figuur);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Mijn oppervlak bevat:");

        for (Figuur figuur : figuren) {
            stringBuilder.append("\n\n").append(figuur.toString());
        }

        return stringBuilder.toString();
    }
}
