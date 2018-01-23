package fr.iutvalence.rt.robot;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

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
        Assert.assertThat("Invalid default wheel", new Roue().toString(), is("Roue(10)"));
    }

    /** Test a wheel of the given size. */
    @Test
    public void testRoue() {
        Assert.assertThat("Invalid custom wheel", new Roue(50).toString(), is("Roue(50)"));
    }

}
