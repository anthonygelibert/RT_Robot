package fr.iutvalence.rt.robot;

public class LivingRobot {

	public static void main(String[] args) {
		Robot r = new Robot(0, 0, 50);
		System.out.println(r);
		r.avancer();
		r.avancer();
		r.tournerDroite();
		r.avancer();
		r.avancer();
		System.out.println(r);

		Bras b = new Bras();
		System.out.println(b);
		b.fermerPince();
		System.out.println(b);

	}

}
