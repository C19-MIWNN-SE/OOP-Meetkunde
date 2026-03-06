package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.Cirkel;
import nl.miwnn.ch19.vincent.meetkunde.model.Figuur;
import nl.miwnn.ch19.vincent.meetkunde.model.Punt;
import nl.miwnn.ch19.vincent.meetkunde.model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Figuur[] figuren = new Figuur[3];

        figuren[0] = new Cirkel(3, new Punt(1, 4), "blauw");
        figuren[1] = new Cirkel(7);
        figuren[2] = new Rechthoek();



        for (int figuur = 0; figuur < figuren.length; figuur++) {
            System.out.println(figuren[figuur]);
            toonInformatie(figuren[figuur]);
        }

        System.out.println(new Rechthoek(4, 5));
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }

}
