import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OrraDebTest {


	Orra majró; 

	@Before
	public void setUp() throws Exception {
		majró = new Orra();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOrra() {
		String testWord = "ORRA";
		Boolean isEqual = testWord.equals(majró.Oorra());
		
		assertTrue(isEqual);
	}
	
	@Test
	public void testDeb() {
		assertEquals(majró.giveAnswer("ORRA"), "DEB");
	}
	
	@Test
	public void testIfAnythingGivenButOrraReturnORRA()
	{
		assertEquals(majró.giveAnswer("Feje"), "ORRA");
		assertEquals(majró.giveAnswer("törölközője"),"ORRA");
	}
	
	@Test
	public void testIfNothingIsGivenReturnsDots()
	{
		assertEquals(majró.giveAnswer(""), "O_@_O");
		assertEquals(majró.giveAnswer(null),"O_@_O");
	}
	
	@Test
	public void testCactusNeedsSpecialAttention() {
		assertEquals(majró.giveAnswer("Kaktusz"),"PFFFFFFF!!!!!");
	}

}
