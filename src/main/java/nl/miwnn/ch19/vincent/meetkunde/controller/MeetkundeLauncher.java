package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.Cirkel;
import nl.miwnn.ch19.vincent.meetkunde.model.Punt;
import nl.miwnn.ch19.vincent.meetkunde.model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "blauw");
        mijnCirkelArray[1] = new Cirkel(6);
        mijnCirkelArray[2] = new Cirkel();

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.println(mijnCirkelArray[cirkel]);
            System.out.println();
        }

        System.out.println(new Rechthoek(4, 5));
    }

}
