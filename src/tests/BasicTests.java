package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import calculator.Calculator;
import calculator.CalculatorImpl;

class BasicTests {

	static Calculator calc;
	
	@BeforeAll
	static void setupCalculator() {
		calc = new CalculatorImpl();
	}
	
	
	@Test
	void testAddNumber() {
		// add 2 positive numbers
		assertEquals(2, calc.addNumber(1, 1));
		
		// add 2 negative numbers
		assertEquals(-2, calc.addNumber(-1,-1));
		
		// add 2 0s
		assertEquals(0, calc.addNumber(0, 0));
	}
	
	@Test
	void testIsNumberPositive() {
		assertEquals(true, calc.isNumberPositive(-4));
		
		assertEquals(false, calc.isNumberPositive(4));
	}
}
