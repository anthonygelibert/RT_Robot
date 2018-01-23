package fr.iutvalence.rt.robot;

public enum Orientation {
    NORD(0, 1), OUEST(-1, 0), SUD(0, -1), EST(1, 0);

    public final int deltaX;
    public final int deltaY;

    Orientation(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

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
