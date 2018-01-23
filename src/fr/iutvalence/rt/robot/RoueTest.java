package fr.iutvalence.rt.robot;


import org.junit.Assert;
import org.junit.Test;

public class RoueTest {

    @Test
    public final void testRoueInt() {
        Assert.assertEquals("Roue(10)", new Roue().toString());
    }

    @Test
    public final void testRoue() {
        Assert.assertEquals("Roue(50)", new Roue(50).toString());
    }

}
