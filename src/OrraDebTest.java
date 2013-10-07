import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OrraDebTest {


	Orra majro; 

	@Before
	public void setUp() throws Exception {
		majro = new Orra();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOrra() {
		String testWord = "ORRA";
		Boolean isEqual = testWord.equals(majro.Oorra());
		
		assertTrue(isEqual);
	}
	
	@Test
	public void testDeb() {
		assertEquals(majro.giveAnswer("ORRA"), "DEB");
	}
	
	@Test
	public void testIfAnythingGivenButOrraReturnORRA()
	{
		assertEquals(majro.giveAnswer("Feje"), "ORRA");
		assertEquals(majro.giveAnswer("törölközője"),"ORRA");
	}
	
	@Test
	public void testIfNothingIsGivenReturnsDots()
	{
		assertEquals(majro.giveAnswer(""), "O_@_O");
		assertEquals(majro.giveAnswer(null),"O_@_O");
	}
	
	@Test
	public void testCactusNeedsSpecialAttention() {
		assertEquals(majro.giveAnswer("Kaktusz"),"PFFFFFFF!!!!!");
	}
	
	

}
