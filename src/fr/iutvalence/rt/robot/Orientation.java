package fr.iutvalence.rt.robot;

/**
 * Robot's orientation (currently four available).
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public enum Orientation {
    /** North. */
    NORD(0, 1),
    /** West. */
    OUEST(-1, 0),
    /** South. */
    SUD(0, -1),
    /** East. */
    EST(1, 0);

    /** When moving, delta of the current orientation in the X axe of the orthonormal frame. */
    public final int m_deltaX;
    /** When moving, delta of the current orientation in the Y axe of the orthonormal frame. */
    public final int m_deltaY;

    /** Create a new orientation with its moving vector. */
    Orientation(final int deltaX, final int deltaY) {
        this.m_deltaX = deltaX;
        this.m_deltaY = deltaY;
    }

    /** Which orientation when turn on right. */
    public Orientation tournerDroite() {
        if (this == NORD) {
            return EST;
        }
        if (this == EST) {
            return SUD;
        }
        if (this == SUD) {
            return OUEST;
        }
        return NORD;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
