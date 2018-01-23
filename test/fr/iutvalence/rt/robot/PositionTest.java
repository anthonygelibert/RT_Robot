package fr.iutvalence.rt.robot;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

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
        Assert.assertThat("Invalid default position", new Position().toString(), is("(0,0)"));
    }

    /** Test a position at a given coordinate. */
    @Test
    public void testCustomPosition() {
        Assert.assertThat("Invalid custom position", new Position(5, 5).toString(), is("(5,5)"));
    }

    @Test
    public void testShift() {
        Position p = new Position().deplacer(50, 50);
        Assert.assertThat("Invalid positive shift", p.toString(), is("(50,50)"));
        p =  p.deplacer(-50,-50 );
        Assert.assertThat("Invalid negative shift", p.toString(), is("(0,0)"));


    }
}
