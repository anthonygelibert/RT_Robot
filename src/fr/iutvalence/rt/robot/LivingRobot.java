package fr.iutvalence.rt.robot;

/**
 * Small class to illustrate Robot.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public class LivingRobot {
    /**
     * Main method.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final Robot r = new Robot(0, 0, 50);
        System.out.println(r);
        r.avancer();
        r.avancer();
        r.tournerDroite();
        r.avancer();
        r.avancer();
        System.out.println(r);

        final Bras b = new Bras();
        System.out.println(b);
        b.fermerPince();
        System.out.println(b);

    }

}
