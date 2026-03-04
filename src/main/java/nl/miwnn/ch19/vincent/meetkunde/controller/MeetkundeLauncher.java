package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.model.Cirkel;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.out.println(Cirkel.aantalCirkels);

        Cirkel mijnEersteCirkel = new Cirkel(3, 3, -2, "blauw");

        Cirkel mijnTweedeCirkel = new Cirkel(5);

        System.out.println(Cirkel.geefDefinitie());

        System.out.println(mijnEersteCirkel.volgnummer);
        System.out.println(mijnEersteCirkel.geefOmtrek());
        System.out.println(mijnEersteCirkel.geefOppervlakte());
        System.out.println(mijnEersteCirkel.kleur);
        System.out.println();

        System.out.println(mijnTweedeCirkel.volgnummer);
        System.out.println(mijnTweedeCirkel.geefOmtrek());
        System.out.println(mijnTweedeCirkel.geefOppervlakte());
        System.out.println(mijnTweedeCirkel.kleur);

        System.out.println(Cirkel.aantalCirkels);
    }

}
