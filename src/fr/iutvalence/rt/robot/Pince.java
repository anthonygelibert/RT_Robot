package fr.iutvalence.rt.robot;

public class Pince {
    public static final boolean DEFAULT_STATE = true;
    private             boolean ouvert;

    public Pince(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public Pince() {
        this(Pince.DEFAULT_STATE);
    }

    public void ouvrir() {
        this.ouvert = true;
    }

    public void fermer() {
        this.ouvert = false;
    }

    @Override
    public String toString() {
        return this.ouvert ? "pince ouverte" : "pince fermée";
    }

}
