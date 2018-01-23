package fr.iutvalence.rt.robot;

/**
 * Robot's hand.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public class Pince {
    /** Hand's default state. */
    public static final boolean DEFAULT_STATE = true;
    /** Current state. */
    private             boolean ouvert;

    /** Create a new hand in the given state. */
    public Pince(boolean ouvert) {
        this.ouvert = ouvert;
    }

    /** Create a new hand in the default state. */
    public Pince() {
        this(Pince.DEFAULT_STATE);
    }

    /** Open the hand. */
    public void ouvrir() {
        this.ouvert = true;
    }

    /** Close the hand. */
    public void fermer() {
        this.ouvert = false;
    }

    @Override
    public String toString() {
        return this.ouvert ? "pince ouverte" : "pince fermée";
    }

}
