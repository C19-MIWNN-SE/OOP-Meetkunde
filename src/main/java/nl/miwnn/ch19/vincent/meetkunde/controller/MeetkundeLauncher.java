package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.Cirkel;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, 1, 4, "blauw");
        mijnCirkelArray[1] = new Cirkel(6);
        mijnCirkelArray[2] = new Cirkel();

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.println(mijnCirkelArray[cirkel].getVolgnummer());
            System.out.println(mijnCirkelArray[cirkel].geefOmtrek());
            System.out.println(mijnCirkelArray[cirkel].geefOppervlakte());
            System.out.println(mijnCirkelArray[cirkel].vertelOverGrootte());
            System.out.println();
        }
    }

}
