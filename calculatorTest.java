package junitTutorial;

import static org.junit.Assert.*;

import javax.print.DocFlavor.INPUT_STREAM;

import org.junit.Test;

public class calculatorTest {


	
	@Test
	public void testAddPositive() {
		int a=2;
		int b=7;
		calculator c1= new calculator();
		int result=c1.add(a, b);
		assertEquals(9, result);	
	
	}
	@Test
	
	public void testAddNegative() {
		int a=-2;
		int b=-7;
		calculator c1= new calculator();
		int result=c1.add(a, b);
		assertEquals(-9, result);	
	
	}
}
