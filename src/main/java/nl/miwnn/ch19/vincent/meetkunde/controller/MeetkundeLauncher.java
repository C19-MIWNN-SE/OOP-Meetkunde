package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Figuur> figuren = new ArrayList<>();

        try (Scanner bestandslezer = new Scanner(new File("src/main/resources/Rechthoeken.csv"))) {
            while (bestandslezer.hasNextLine()) {
                String[] rechthoekEigenschappen = bestandslezer.nextLine().split(",");

                double lengte = Double.parseDouble(rechthoekEigenschappen[0]);
                double breedte = Double.parseDouble(rechthoekEigenschappen[1]);
                double xCoordinaat = Double.parseDouble(rechthoekEigenschappen[2]);
                double yCoordinaat = Double.parseDouble(rechthoekEigenschappen[3]);
                String kleur = rechthoekEigenschappen[4];

                figuren.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("De Rechthoeken CSV kon niet geopend worden.");
            System.err.println(fileNotFoundException.getMessage());
        }

        try (PrintWriter writer = new PrintWriter("src/main/resources/Rechthoeken.txt")) {
            for (Figuur figuur : figuren) {
                writer.println(figuur);
                writer.println();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Het Rechthoeken tekst bestand kon niet worden gemaakt/geopened.");
            System.err.println(fileNotFoundException.getMessage());
        }


    }

}
