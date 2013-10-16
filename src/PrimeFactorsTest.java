import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class PrimeFactorsTest {


	private List<Integer> expected;

	@Before
	public void setUp() {
		expected = new ArrayList<>();
	}
	
	@Test
	public void zeroTest() {
		assertEquals(new ArrayList<Integer>(), PrimeFactors.generate(0));
	}
	
	@Test
	public void oneShouldReturnOne() {
		expected.add(1);
		assertEquals(expected,PrimeFactors.generate(1));
	}
	
	@Test
	public void twoShouldReturnTwo(){
		expected.add(2);
		assertEquals(expected, PrimeFactors.generate(2));
	}
	
	@Test
	public void threeShouldReturnThree(){
		expected.add(3);
		assertEquals(expected, PrimeFactors.generate(3));
	}
	
	@Test
	public void fourShouldReturnTwoTwo(){
		expected.add(2);
		expected.add(2);
		assertEquals(expected, PrimeFactors.generate(4));
	}
	
	@Test
	public void fiveShouldReturnFive() {
		expected.add(5);
		assertEquals(expected,PrimeFactors.generate(5));
	}

	@Test
	public void sixShouldReturnTwoThree() {
		expected.add(2);
		expected.add(3);
		assertEquals(expected,PrimeFactors.generate(6));
	}
	
	@Test
	public void sevenShouldReturnSeven() {
		expected.add(7);
		assertEquals(expected,PrimeFactors.generate(7));
	}
	
	@Test
	public void eightShouldReturnTwoTwoTwo() {
		expected.add(2);
		expected.add(2);
		expected.add(2);		
		assertEquals(expected,PrimeFactors.generate(8));
	}

	@Test
	public void nineShouldReturnThreeThree() {
		expected.add(3);
		expected.add(3);
		assertEquals(expected,PrimeFactors.generate(9));
	}
	
	@Test
	public void tenShouldReturnTwoFive() {
		expected.add(2);
		expected.add(5);
		assertEquals(expected,PrimeFactors.generate(10));
	}
	
	@Test
	public void twelveShouldReturnTwoTwoThree() {
		expected.add(2);
		expected.add(2);
		expected.add(3);
		assertEquals(expected,PrimeFactors.generate(12));
	}
		
	@Test
	public void thirteenShouldReturnTwoThreeFive() {
		expected.add(2);
		expected.add(3);
		expected.add(5);
		assertEquals(expected,PrimeFactors.generate(30));
	}
}
