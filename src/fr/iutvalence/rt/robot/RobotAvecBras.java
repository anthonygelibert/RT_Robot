package fr.iutvalence.rt.robot;

public class RobotAvecBras extends Robot {
    private final Bras bras = new Bras();

    public RobotAvecBras() {
        super();
    }

    public RobotAvecBras(int x, int y, int diametre) {
        super(x, y, diametre);
    }

    public RobotAvecBras(int x, int y) {
        super(x, y);
    }

    public void leverBras() {
        this.bras.lever();
    }

    public void baisserBras() {
        this.bras.baisser();
    }

    public void ouvrirPince() {
        this.bras.ouvrirPince();
    }

    public void fermerPince() {
        this.bras.fermerPince();
    }
}
