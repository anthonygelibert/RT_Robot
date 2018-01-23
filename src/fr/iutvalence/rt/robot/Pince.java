package fr.iutvalence.rt.robot;

/**
 * Robot's hand.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class Pince {
    /** Hand's default state. */
    public static final boolean DEFAULT_STATE = true;
    /** Current state. */
    private             boolean m_ouvert;

    /** Create a new hand in the given state. */
    public Pince(boolean ouvert) {
        this.m_ouvert = ouvert;
    }

    /** Create a new hand in the default state. */
    public Pince() {
        this(Pince.DEFAULT_STATE);
    }

    /** Open the hand. */
    public void ouvrir() {
        this.m_ouvert = true;
    }

    /** Close the hand. */
    public void fermer() {
        this.m_ouvert = false;
    }

    @Override
    public String toString() {
        return this.m_ouvert ? "pince ouverte" : "pince fermée";
    }

}
