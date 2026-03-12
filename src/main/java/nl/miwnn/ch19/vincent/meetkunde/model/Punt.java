package nl.miwnn.ch19.vincent.meetkunde.model;

/**
 * @author Vincent Velthuizen
 * Een punt in de 2D ruimte
 */
public class Punt {
    private static final double DEFAULT_X_COORDINAAT = 0.0;
    private static final double DEFAULT_Y_COORDINAAT = 0.0;

    private double xCoordinaat;
    private double yCoordinaat;

    public Punt(double xCoordinaat, double yCoordinaat) {
        this.xCoordinaat = xCoordinaat;
        this.yCoordinaat = yCoordinaat;
    }

    public Punt() {
        this(DEFAULT_X_COORDINAAT, DEFAULT_Y_COORDINAAT);
    }

    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", this.xCoordinaat, this.yCoordinaat);
    }

    public double getxCoordinaat() {
        return xCoordinaat;
    }

    public void setxCoordinaat(double xCoordinaat) {
        this.xCoordinaat = xCoordinaat;
    }

    public double getyCoordinaat() {
        return yCoordinaat;
    }

    public void setyCoordinaat(double yCoordinaat) {
        this.yCoordinaat = yCoordinaat;
    }
}
