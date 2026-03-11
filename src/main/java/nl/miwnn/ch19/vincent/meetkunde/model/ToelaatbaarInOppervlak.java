package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * Moet de vraag kunnen beantwoorden of dit object past in een oppervlak (lengte en breedte)
 *
 * @author Vincent Velthuizen
 */
public interface ToelaatbaarInOppervlak {
    boolean pastInOppervlak(double lengte, double breedte);
}
