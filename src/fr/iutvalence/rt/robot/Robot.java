package fr.iutvalence.rt.robot;

public class Robot {
    private final Roue        roueGauche;
    private final Roue        roueDroite;
    private       Position    position;
    private       Orientation orientation = Orientation.NORD;

    public Robot() {
        this(Position.DEFAULT_X, Position.DEFAULT_Y, Roue.DEFAULT_DIAM);
    }

    public Robot(int x, int y) {
        this(x, y, Roue.DEFAULT_DIAM);
    }

    public Robot(int x, int y, int diametre) {
        this.roueGauche = new Roue(diametre);
        this.roueDroite = new Roue(diametre);
        this.position = new Position(x, y);
    }

    public void tournerDroite() {
        this.orientation = this.orientation.tournerDroite();
    }

    public Position getPosition() {
        return this.position;
    }

    public void avancer() {
        this.position = this.position.deplacer(this.orientation.deltaX * this.roueGauche.diametre,
                                               this.orientation.deltaY * this.roueGauche.diametre);
    }

    @Override
    public String toString() {
        return String.format("Robot[%s,%s]@%s°%s", this.roueGauche, this.roueDroite, this.position, this.orientation);
    }
}
