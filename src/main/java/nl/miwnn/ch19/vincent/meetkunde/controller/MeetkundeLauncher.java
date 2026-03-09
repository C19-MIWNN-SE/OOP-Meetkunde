package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.Cirkel;
import nl.miwnn.ch19.vincent.meetkunde.model.Figuur;
import nl.miwnn.ch19.vincent.meetkunde.model.Punt;
import nl.miwnn.ch19.vincent.meetkunde.model.Rechthoek;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Figuur> mijnFiguren = new ArrayList<>();

        mijnFiguren.add(new Cirkel(3, new Punt(1, 4), "blauw"));
        mijnFiguren.add(new Cirkel(7));
        mijnFiguren.add(0, new Rechthoek());

        mijnFiguren.remove(1);

        for (Figuur value : mijnFiguren) {
            System.out.println(value);
            toonInformatie(value);
        }

        for (Figuur figuurUitDeLijst : mijnFiguren) {
            System.out.println(figuurUitDeLijst);
            toonInformatie(figuurUitDeLijst);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }

}
