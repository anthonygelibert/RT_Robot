package fr.iutvalence.rt.robot;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {
	@Test
	public void TestDefaultPosition() {
		Assert.assertEquals("(0,0)", new Position().toString());
	}
	
	@Test
	public void TestCustomPosition() {
		Assert.assertEquals("(5,5)", new Position(5,5).toString());
	}
}
