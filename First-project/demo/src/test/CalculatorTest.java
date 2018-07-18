package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo.Calculator;

class CalculatorTest {

	@Test
	void testEvaluate() {
		//fail("Not yet implemented");
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}

}
