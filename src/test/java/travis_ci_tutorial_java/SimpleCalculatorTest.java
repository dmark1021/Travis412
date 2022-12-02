package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest
{
	@Test
	public void testAdd() 
	{
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 4);
	}
	public void testSub() 
	{
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 4);
	}
	public void testMultiply() 
	{
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 4);
	}
}

