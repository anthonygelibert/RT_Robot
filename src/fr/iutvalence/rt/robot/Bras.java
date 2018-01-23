package fr.iutvalence.rt.robot;

/**
 * Robot's arm (have a single hand, in its default state).
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class Bras {
    /** Default arm state. */
    public static final boolean DEFAULT_STATE = false;
    /** Hand at the end of the arm. */
    private final       Pince   m_pince;
    /** Current state of the arm. */
    private             boolean m_leve;

    /** Create an arm in it's default state. */
    public Bras() {
        this(Bras.DEFAULT_STATE);
    }

    /** Create an arm in the given state. */
    public Bras(final boolean leve) {
        this.m_leve = leve;
        this.m_pince = new Pince();
    }

    /** Raise the arm. */
    public void lever() {
        this.m_leve = true;
    }

    /** Lower the arm. */
    public void baisser() {
        this.m_leve = false;
    }

    /** Open the hand. */
    public void ouvrirPince() {
        this.m_pince.ouvrir();
    }

    /** Close the hand. */
    public void fermerPince() {
        this.m_pince.fermer();
    }

    @Override
    public String toString() {
        return (this.m_leve ? "bras levé" : "bras baissé") + " et " + this.m_pince;
    }
}
