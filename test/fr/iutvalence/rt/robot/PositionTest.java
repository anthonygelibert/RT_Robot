package fr.iutvalence.rt.robot;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for the Position class.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 * @see Position
 */
public final class PositionTest {
    /** Test a position at the default coordinate. */
    @Test
    public void testDefaultPosition() {
        Assert.assertEquals("Invalid default position", "(0,0)", new Position().toString());
    }

    /** Test a position at a given coordinate. */
    @Test
    public void testCustomPosition() {
        Assert.assertEquals("Invalid custom position","(5,5)", new Position(5, 5).toString());
    }
}
