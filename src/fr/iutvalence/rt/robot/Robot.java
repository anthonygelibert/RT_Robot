package fr.iutvalence.rt.robot;

/**
 * Robot with two wheels.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public class Robot {
    /** Left wheel. */
    private final Roue        m_roueGauche;
    /** Right wheel. */
    private final Roue        m_roueDroite;
    /** Robot's position. */
    private       Position    m_position;
    /** Robot's orientation. */
    private       Orientation m_orientation = Orientation.NORD;

    /** Create a new robot at the default position with the default wheel size. */
    public Robot() {
        this(Position.DEFAULT_X, Position.DEFAULT_Y, Roue.DEFAULT_SIZE);
    }

    /** Create a new robot at the given position. */
    public Robot(final int x, final int y) {
        this(x, y, Roue.DEFAULT_SIZE);
    }

    /** Create a new robot at the given position with the given wheel size. */
    public Robot(final int x, final int y, final int diametre) {
        this.m_roueGauche = new Roue(diametre);
        this.m_roueDroite = new Roue(diametre);
        this.m_position = new Position(x, y);
    }

    /** Turn on the right. */
    public final void tournerDroite() {
        this.m_orientation = this.m_orientation.tournerDroite();
    }

    /** Get the current robot position. */
    public final Position getPosition() {
        return this.m_position;
    }

    /** Move forward. */
    public final void avancer() {
        this.m_position = this.m_position.deplacer(this.m_orientation.m_deltaX * this.m_roueGauche.m_diametre,
                                                   this.m_orientation.m_deltaY * this.m_roueGauche.m_diametre);
    }

    @Override
    public String toString() {
        return String.format("Robot[%s,%s]@%s°%s", this.m_roueGauche, this.m_roueDroite, this.m_position,
                             this.m_orientation);
    }
}
