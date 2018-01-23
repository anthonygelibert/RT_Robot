package fr.iutvalence.rt.robot;


import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Roue.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class RoueTest {

    /** Test a wheel of the default size. */
    @Test
    public void testRoueInt() {
        Assert.assertEquals("Roue(10)", new Roue().toString());
    }

    /** Test a wheel of the given size. */
    @Test
    public void testRoue() {
        Assert.assertEquals("Roue(50)", new Roue(50).toString());
    }

}
