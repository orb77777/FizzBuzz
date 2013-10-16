import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class StringCalculatorTest {

	private StringCalculator calc;

	@Test
	public void emptyStringShouldReturnZero() {
		calc = new StringCalculator();
		assertEquals(new Integer(0), calc.sum(""));
	}
	
	@Test
	public void aSingleNumberShouldReturnValue(){
		calc = new StringCalculator();
		assertEquals(new Integer(42), calc.sum("42"));
	}

	@Test
	public void twoNumberDelimitedByCommaShouldReturnSum(){
		calc = new StringCalculator();
		assertEquals(new Integer(42),calc.sum("27,15"));
	}        
	
	@Test
	public void twoNumberDelimitedByNewLineShouldReturnSum(){
		calc = new StringCalculator();
		assertEquals(new Integer(42),calc.sum("27\n15"));
	}        
	
	@Test
	public void threeNumberDelimitedBySomethingShouldReturnSum(){
		calc = new StringCalculator();
		assertEquals(new Integer(731),calc.sum("699,31\n1"));
	}
	
	@Test(expected=NegativeNumberException.class)
	public void negativeNumbersShouldThrowException(){
		calc = new StringCalculator();
		calc.sum("-42");
	}
	
	@Test
	public void shouldIgnoreNumbersGreaterThan1000(){
		calc = new StringCalculator();
		assertEquals(new Integer(0),calc.sum("1001"));
		assertEquals(new Integer(622),calc.sum("1002,622"));
		assertEquals(new Integer(622),calc.sum("311,311,3003"));
	}
	
	@Test
	public void shouldWorkWithCustomDelimiter(){
		calc = new StringCalculator();
		assertEquals(new Integer(0), calc.sum("//#\n"));
		assertEquals(new Integer(56), calc.sum("//#\n50#6"));
	}
	
	@Test
	public void shouldWorkWithMultiCharDelimiters() {
		calc = new StringCalculator();
		assertEquals(new Integer(32), calc.sum("//[#@]\n20#@1#@1#@10"));
	}
	
	@Ignore
	@Test
	public void shouldWorkWithMultipleMultiCharOrSingleCharDelimiter() {
		
	}
}
