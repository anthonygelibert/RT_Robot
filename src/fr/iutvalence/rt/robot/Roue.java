package fr.iutvalence.rt.robot;

/**
 * Robot's wheel.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public class Roue {
    /** Default size of the wheel. */
    public static final int DEFAULT_DIAM = 10;
    /** Size of the wheel. */
    public final        int diametre;

    /** Create a wheel of the given size. */
    public Roue(int diametre) {
        this.diametre = diametre;
    }

    /** Create a wheel of the default size. */
    public Roue() {
        this(DEFAULT_DIAM);
    }

    @Override
    public String toString() {
        return "Roue(" + diametre + ")";
    }

}


