package fr.iutvalence.rt.robot;

/**
 * Robot's wheel.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class Roue {
    /** Default size of the wheel. */
    public static final int DEFAULT_SIZE = 10;
    /** Size of the wheel. */
    public final        int m_diametre;

    /** Create a wheel of the given size. */
    public Roue(final int diametre) {
        this.m_diametre = diametre;
    }

    /** Create a wheel of the default size. */
    public Roue() {
        this(DEFAULT_SIZE);
    }

    @Override
    public String toString() {
        return String.format("Roue(%d)", m_diametre);
    }

}


