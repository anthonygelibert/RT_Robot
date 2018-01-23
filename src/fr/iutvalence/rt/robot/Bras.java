package fr.iutvalence.rt.robot;

/**
 * Robot's arm (have a single hand, in its default state).
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public class Bras {
    /** Default arm state. */
    public static final boolean DEFAULT_STATE = false;
    /** Hand at the end of the arm. */
    private final       Pince   pince;
    /** Current state of the arm. */
    private             boolean leve;

    /** Create an arm in it's default state. */
    public Bras() {
        this(Bras.DEFAULT_STATE);
    }

    /** Create an arm in the given state. */
    public Bras(boolean leve) {
        this.leve = leve;
        this.pince = new Pince();
    }

    /** Raise the arm. */
    public void lever() {
        this.leve = true;
    }

    /** Lower the arm. */
    public void baisser() {
        this.leve = false;
    }

    /** Open the hand. */
    public void ouvrirPince() {
        this.pince.ouvrir();
    }

    /** Close the hand. */
    public void fermerPince() {
        this.pince.fermer();
    }

    @Override
    public String toString() {
        return (this.leve ? "bras levé" : "bras baissé") + " et " + this.pince;
    }
}
