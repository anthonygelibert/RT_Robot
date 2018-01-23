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
public class PositionTest {
    /** Test a position at the default coordinate. */
    @Test
    public void TestDefaultPosition() {
        Assert.assertEquals("(0,0)", new Position().toString());
    }

    /** Test a position at a given coordinate. */
    @Test
    public void TestCustomPosition() {
        Assert.assertEquals("(5,5)", new Position(5, 5).toString());
    }
}
