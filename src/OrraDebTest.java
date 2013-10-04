import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OrraDebTest {


	Orra orra; 

	@Before
	public void setUp() throws Exception {
		orra = new Orra();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOrra() {
		String testWord = "ORRA";
		Boolean isEqual = testWord.equals(orra.Oorra());
		
		assertTrue(isEqual);
	}
	
	@Test
	public void testIfZeroReturnsZero() {
		assertEquals(orra.giveFizzBuzzNumber(0),0);
	}
	
	@Test
	public void testDeb() {
		assertEquals(orra.giveDEB("ORRA"), "DEB");
	}
	
	@Test
	public void testIfNumberDividableByThreeGivesBackORRA() {
		assertEquals(orra.giveFizzBuzzNumber(3),"DEB");
	}

		

}
