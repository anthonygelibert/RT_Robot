package fr.iutvalence.rt.robot;

public class Bras {
	public static final boolean DEFAULT_STATE = false;

	private final Pince pince;
	private boolean leve;

	public Bras() {
		this(Bras.DEFAULT_STATE);
	}

	public Bras(boolean leve) {
		this.leve = leve;
		this.pince = new Pince();
	}

	public void lever() {
		this.leve = true;
	}

	public void baisser() {
		this.leve = false;
	}

	public void ouvrirPince() {
		this.pince.ouvrir();
	}

	public void fermerPince() {
		this.pince.fermer();
	}

	@Override
	public String toString() {
		return (this.leve ? "bras levé" : "bras baissé") + " et " + this.pince;
	}
}
