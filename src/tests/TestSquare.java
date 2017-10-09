package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Square;

public class TestSquare {

	@Test
	public void testCalculateArea() {
		assertEquals(9, new Square(3).calculateArea(), 0.000000001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeSquare() {
		new Square(-1);
	}

	@Test
	public void testGetSide() {
		assertEquals(2, new Square(2).getSide(), 0);
	}

}
