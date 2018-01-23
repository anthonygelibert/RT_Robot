package fr.iutvalence.rt.robot;

/**
 * Immutable coordinates in a 2D orthonormal frame.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class Position {
    /** Default X coordinate. */
    public static final int DEFAULT_X = 0;
    /** Default Y coordinate. */
    public static final int DEFAULT_Y = 0;

    /** X coordinate. */
    private final int m_x;
    /** Y coordinate. */
    private final int m_y;

    /** Create a new position at the given coordinate. */
    public Position(int x, int y) {
        this.m_x = x;
        this.m_y = y;
    }

    /** Create a new position at the default coordinate. */
    public Position() {
        this(DEFAULT_X, DEFAULT_Y);
    }

    /** Shift the current position from the given delta and generate the corresponding position. */
    public Position deplacer(int deltaX, int deltaY) {
        return new Position(m_x + deltaX, m_y + deltaY);
    }

    @Override
    public String toString() {
        return "(" + m_x + "," + m_y + ")";
    }

}
