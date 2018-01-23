package fr.iutvalence.rt.robot;

/**
 * Robot with two wheels.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public class Robot {
    /** Left wheel. */
    private final Roue        roueGauche;
    /** Right wheel. */
    private final Roue        roueDroite;
    /** Robot's position. */
    private       Position    position;
    /** Robot's orientation. */
    private       Orientation orientation = Orientation.NORD;

    /** Create a new robot at the default position with the default wheel size. */
    public Robot() {
        this(Position.DEFAULT_X, Position.DEFAULT_Y, Roue.DEFAULT_DIAM);
    }

    /** Create a new robot at the given position. */
    public Robot(int x, int y) {
        this(x, y, Roue.DEFAULT_DIAM);
    }

    /** Create a new robot at the given position with the given wheel size. */
    public Robot(int x, int y, int diametre) {
        this.roueGauche = new Roue(diametre);
        this.roueDroite = new Roue(diametre);
        this.position = new Position(x, y);
    }

    /** Turn on the right. */
    public void tournerDroite() {
        this.orientation = this.orientation.tournerDroite();
    }

    /** Get the current robot position. */
    public Position getPosition() {
        return this.position;
    }

    /** Move forward. */
    public void avancer() {
        this.position = this.position.deplacer(this.orientation.deltaX * this.roueGauche.diametre,
                                               this.orientation.deltaY * this.roueGauche.diametre);
    }

    @Override
    public String toString() {
        return String.format("Robot[%s,%s]@%s°%s", this.roueGauche, this.roueDroite, this.position, this.orientation);
    }
}
