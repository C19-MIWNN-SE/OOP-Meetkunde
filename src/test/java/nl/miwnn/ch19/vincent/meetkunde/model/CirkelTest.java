package nl.miwnn.ch19.vincent.meetkunde.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirkelTest {

    @Test
    @DisplayName("geefOmtrek straal 5 geeft correcte omtrek")
    void geefOmtrekStraal5GeeftCorrecteOmtrek() {
        Cirkel cirkel = new Cirkel(5.0);
        double verwachteOmtrek = 31.42;

        double daadwerkelijkeOmtrek = cirkel.geefOmtrek();

        assertEquals(verwachteOmtrek, daadwerkelijkeOmtrek, 0.01);
    }

    @Test
    @DisplayName("geefOmtrek straal 1 geeft correcte omtrek")
    void geefOmtrekStraal1GeeftCorrecteOmtrek() {
        Cirkel cirkel = new Cirkel();
        double verwachteOmtrek = 6.284;

        double daadwerkelijkeOmtrek = cirkel.geefOmtrek();

        assertEquals(verwachteOmtrek, daadwerkelijkeOmtrek, 0.001);
    }

    @Test
    @DisplayName("geefOppervlakte straal 5 geeft correct oppervlak")
    void geefOppervlakteStraal5GeeftCorrectOppervlak() {
        Cirkel cirkel = new Cirkel(5.0);
        double verwachteOppervlak = 78.54;

        double daadwerkelijkeOppervlak = cirkel.geefOppervlakte();

        assertEquals(verwachteOppervlak, daadwerkelijkeOppervlak, 0.01);
    }

    @Test
    @DisplayName("geefOppervlakte straal 1 geeft correct oppervlak")
    void geefOppervlakteStraal1GeeftCorrectOppervlak() {
        Cirkel cirkel = new Cirkel();
        double verwachteOppervlak = 3.14;

        double daadwerkelijkeOppervlak = cirkel.geefOppervlakte();

        assertEquals(verwachteOppervlak, daadwerkelijkeOppervlak, 0.01);
    }
}