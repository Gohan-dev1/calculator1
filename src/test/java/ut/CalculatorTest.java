package ut;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;



public class CalculatorTest {

	static Calculator cl;

	@BeforeClass
	public static void setUp() {
		cl = new Calculator();
	}

	@AfterClass
	public static void tearDown() {
		System.gc();
	}

	@Test
	public void testAdd() {

		assertTrue(cl.doAdd(1, 2) == 4);
	}

	@Test
	public void testSub() {
		assertTrue(cl.doSub(1, 1) == 0);
	}

	@Test
	public void testMul() {
		assertTrue(cl.doMul(9, 2) == 18);
	}

	@Test
	public void testDiv() {
		assertTrue(cl.doDiv(8, 2) == 4);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testMod() {
	   double exp = 3.0;
	   double actual = cl.doMod(7.0, 4.0);
		assertEquals(exp,actual,0.000001);
	}

}
