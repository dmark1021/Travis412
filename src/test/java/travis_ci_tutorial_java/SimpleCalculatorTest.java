package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(SimpleCalculator.minus(5, 3), 2);
		}
	@Test
	public void testMultiple() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(SimpleCalculator.multiple(5, 2), 10);
		}
	@Test
	public void testDevide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(SimpleCalculator.divide(10, 2), 5);
		}
	@Test(expected = ArithmeticException.class)
	public void testDevideby0() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(10, 0);
		}
	}

