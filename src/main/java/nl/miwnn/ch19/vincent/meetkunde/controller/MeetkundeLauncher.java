package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);

        Cirkel cirkel = null;

        while (cirkel == null) {
            System.out.print("Geef een straal: ");

            try {
                double straal = toetsenbord.nextDouble();
                cirkel = new Cirkel(straal);
                toetsenbord.close();
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Sorry dat herken ik niet als een komma-getal, probeer het nog een keer.");
                toetsenbord.nextLine();
            } finally {
                System.out.println("De invoer, goed of niet, is nu helemaal verwerkt.");
            }
        }

        System.out.println(cirkel);
    }

}
