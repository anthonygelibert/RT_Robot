package fr.iutvalence.rt.robot;

public class Roue {

	public static final int DEFAULT_DIAM = 10;
	
	public final int diametre;

	public Roue(int diametre) {
		this.diametre = diametre;
	}

	public Roue() {
		this(DEFAULT_DIAM);
	}

	@Override
	public String toString() {
		return "Roue(" + diametre + ")";
	}

}


