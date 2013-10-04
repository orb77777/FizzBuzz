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
	public void testDeb() {
		assertEquals(orra.giveAnswer("ORRA"), "DEB");
	}
	
	@Test
	public void testIfAnythingGivenButOrraReturnORRA()
	{
		assertEquals(orra.giveAnswer("Feje"), "ORRA");
		assertEquals(orra.giveAnswer("törölközője"),"ORRA");
	}
	
	@Test
	public void testIfNothingIsGivenReturnsDots()
	{
		assertEquals(orra.giveAnswer(""), "...");
		assertEquals(orra.giveAnswer(null),"...");
	}

}
