package fr.iutvalence.rt.robot;

public class Position {
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;

    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
        this(DEFAULT_X, DEFAULT_Y);
    }

    public Position deplacer(int deltaX, int deltaY) {
        return new Position(x + deltaX, y + deltaY);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
