package nl.miwnn.ch19.vincent.meetkunde.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirkelTest {
    private static Cirkel cirkel;
    private static Cirkel cirkel5;
    private static Cirkel cirkel10;

    @BeforeAll
    static void setUp() {
        Cirkel.resetAantalCirkels();
        cirkel = new Cirkel();
        cirkel5 = new Cirkel(5);
        cirkel10 = new Cirkel(10);
    }

    @Test
    @DisplayName("geefOmtrek straal 5 geeft correcte omtrek")
    void geefOmtrekStraal5GeeftCorrecteOmtrek() {
        double verwachteOmtrek = 31.42;

        double daadwerkelijkeOmtrek = cirkel5.geefOmtrek();

        assertEquals(verwachteOmtrek, daadwerkelijkeOmtrek, 0.01);
    }

    @Test
    @DisplayName("geefOmtrek straal 1 geeft correcte omtrek")
    void geefOmtrekStraal1GeeftCorrecteOmtrek() {
        double verwachteOmtrek = 6.284;

        double daadwerkelijkeOmtrek = cirkel.geefOmtrek();

        assertEquals(verwachteOmtrek, daadwerkelijkeOmtrek, 0.001);
    }

    @Test
    @DisplayName("geefOppervlakte straal 5 geeft correct oppervlak")
    void geefOppervlakteStraal5GeeftCorrectOppervlak() {
        double verwachteOppervlak = 78.54;

        double daadwerkelijkeOppervlak = cirkel5.geefOppervlakte();

        assertEquals(verwachteOppervlak, daadwerkelijkeOppervlak, 0.01);
    }

    @Test
    @DisplayName("geefOppervlakte straal 1 geeft correct oppervlak")
    void geefOppervlakteStraal1GeeftCorrectOppervlak() {
        double verwachteOppervlak = 3.14;

        double daadwerkelijkeOppervlak = cirkel.geefOppervlakte();

        assertEquals(verwachteOppervlak, daadwerkelijkeOppervlak, 0.01);
    }
}