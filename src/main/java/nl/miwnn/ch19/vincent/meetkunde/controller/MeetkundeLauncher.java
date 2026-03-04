package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.Cirkel;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.out.println(Cirkel.getAantalCirkels());

        Cirkel mijnEersteCirkel = new Cirkel(-3, 3, -2, "blauw");

        Cirkel mijnTweedeCirkel = new Cirkel(6);
        Cirkel mijnDerdeCirkel = new Cirkel();


        System.out.println(Cirkel.geefDefinitie());

        System.out.println(mijnEersteCirkel.getVolgnummer());
        System.out.println(mijnEersteCirkel.geefOmtrek());
        System.out.println(mijnEersteCirkel.geefOppervlakte());
        System.out.println(mijnEersteCirkel.vertelOverGrootte());
        System.out.println();

        System.out.println(mijnTweedeCirkel.getVolgnummer());
        System.out.println(mijnTweedeCirkel.geefOmtrek());
        System.out.println(mijnTweedeCirkel.geefOppervlakte());
        System.out.println(mijnTweedeCirkel.vertelOverGrootte());

        System.out.println(Cirkel.getAantalCirkels());
    }

}
