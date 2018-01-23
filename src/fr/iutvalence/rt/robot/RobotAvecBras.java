package fr.iutvalence.rt.robot;

/**
 * Robot with an arm.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class RobotAvecBras extends Robot {
    /** Robot's arm. */
    private final Bras m_bras = new Bras();

    /** Create a new robot at the default position with the default wheel size. */
    public  RobotAvecBras() {
        super();
    }

    /** Create a new robot at the given position. */
    public RobotAvecBras(final int x, final int y) {
        super(x, y);
    }

    /** Create a new robot at the given position with the given wheel size. */
    public RobotAvecBras(final int x, final int y, final int diametre) {
        super(x, y, diametre);
    }

    /** Raise the arm. */
    public void leverBras() {
        this.m_bras.lever();
    }

    /** Lower the arm. */
    public void baisserBras() {
        this.m_bras.baisser();
    }

    /** Open the hand. */
    public void ouvrirPince() {
        this.m_bras.ouvrirPince();
    }

    /** Close the hand. */
    public void fermerPince() {
        this.m_bras.fermerPince();
    }
}
