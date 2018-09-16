package com.pretend.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArithmeticCalculator {
	
	ArithmeticCalculator arithmeticCalculator;

	@Test
	public void testAddition() {
		arithmeticCalculator = new ArithmeticCalculator(5.0, "+", 1.0);
		arithmeticCalculator.computeResult();
		assertEquals(6.0, arithmeticCalculator.getResult(), 0.0);
	}
	
	@Test
	public void testSubtraction() {
		arithmeticCalculator = new ArithmeticCalculator(5.0, "-", 1.0);
		arithmeticCalculator.computeResult();
		assertEquals(4.0, arithmeticCalculator.getResult(), 0.0);
	}
	
	@Test
	public void testMultiplication() {
		arithmeticCalculator = new ArithmeticCalculator(5.0, "*", 1.0);
		arithmeticCalculator.computeResult();
		assertEquals(5.0, arithmeticCalculator.getResult(), 0.0);
	}
	
	@Test
	public void testDivision() {
		arithmeticCalculator = new ArithmeticCalculator(10.0, "/", 5.0);
		arithmeticCalculator.computeResult();
		assertEquals(2.0, arithmeticCalculator.getResult(), 0.0);
	}
	
	@Test
	public void testSquarebyN() {
		arithmeticCalculator = new ArithmeticCalculator(5.0, "^", 3.0);
		arithmeticCalculator.computeResult();
		assertEquals(125.0, arithmeticCalculator.getResult(), 0.0);
	}
	
	@Test
	public void testSquareRoot() {
		arithmeticCalculator = new ArithmeticCalculator(625.0, "sqrt", 0.0);
		arithmeticCalculator.computeResult();
		assertEquals(25.0, arithmeticCalculator.getResult(), 0.0);
	}
	
}
