package fr.iutvalence.rt.robot;

/**
 * Small class to illustrate Robot.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class LivingRobot {
    /**
     * Main method.
     *
     * @param args unused
     */
    public static void main(final String... args) {
        final Robot robot = new Robot(0, 0, 50);
        System.out.println(robot);
        robot.avancer();
        robot.avancer();
        robot.tournerDroite();
        robot.avancer();
        robot.avancer();
        System.out.println(robot);

        final Bras arm = new Bras();
        System.out.println(arm);
        arm.fermerPince();
        System.out.println(arm);

    }

}
