package fr.iutvalence.rt.robot;

/**
 * Robot with an arm.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class RobotAvecBras extends Robot {
    /** Robot's arm. */
    private final Bras bras = new Bras();

    /** Create a new robot at the default position with the default wheel size. */
    private RobotAvecBras() {
    }

    /** Create a new robot at the given position. */
    private RobotAvecBras(final int x, final int y) {
        super(x, y);
    }

    /** Create a new robot at the given position with the given wheel size. */
    private RobotAvecBras(final int x, final int y, final int diametre) {
        super(x, y, diametre);
    }

    /** Raise the arm. */
    public void leverBras() {
        this.bras.lever();
    }

    /** Lower the arm. */
    public void baisserBras() {
        this.bras.baisser();
    }

    /** Open the hand. */
    public void ouvrirPince() {
        this.bras.ouvrirPince();
    }

    /** Close the hand. */
    public void fermerPince() {
        this.bras.fermerPince();
    }
}
