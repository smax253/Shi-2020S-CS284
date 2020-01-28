package recit2plans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		assertEquals(10, Calculator.add(4, 6), "4+6");
	}

	@Test
	void testDivide() {
		assertEquals(50, Calculator.divide(400, 8), "400/8");
	}

	@Test
	void testMultiply() {
		assertEquals(63, Calculator.multiply(9, 7), "9*7");
	}

	@Test
	void testSubtract() {
		assertEquals(37, Calculator.subtract(50, 13), "50-13");
	}
	
	@Test
	void testAddValues() {
		int[] test = {6,2,7,9,3};
		int[] target = {9,5,10,12,6};
		assertArrayEquals(target, Calculator.addValues(test, 3), "Add 3 to all values of {6,2,7,9,3}");
	}
	
	@Test
	void testDivideValues() {
		int[] test = {18,14,6,10};
		int[] target = {9,7,3,5};
		assertArrayEquals(target, Calculator.divideValues(test, 2), "Divide all values of {18,14,6,10} by 2");
	}
	
	@Test
	void testIsNegative() {
		assertTrue(Calculator.isNegative(-5), "Is -5 negative?");
	}
}
