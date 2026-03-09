package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.*;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak oppervlak = new Oppervlak(20, 30);
        Cirkel cirkel = new Cirkel();
        oppervlak.voegFiguurToe(cirkel);
        oppervlak.voegFiguurToe(new Cirkel(7));
        oppervlak.voegFiguurToe(new Rechthoek());

        System.out.println(oppervlak);
    }

}
