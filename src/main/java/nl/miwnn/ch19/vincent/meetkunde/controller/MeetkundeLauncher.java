package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Cirkel> cirkels = new ArrayList<>();
        File stralenBestand = new File("src/main/resources/stralen.txt");

        try {
            Scanner bestandslezer = new Scanner(stralenBestand);

            while (bestandslezer.hasNextDouble()) {
                cirkels.add(new Cirkel(bestandslezer.nextDouble()));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Het stralenbestand kon niet geopend worden.");
            System.err.println(fileNotFoundException.getMessage());
        }

        for (Cirkel cirkel : cirkels) {
            System.out.println(cirkel);
            System.out.println();
        }

    }

}
