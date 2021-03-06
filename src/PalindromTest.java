import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class PalindromTest {

	

	private Text text;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIfAWordIsNotPalindrome () {
		text = new Text("Majro");
		assertEquals(false, text.isPalindrome());		
	}
	
	@Test
	public void testIfAWordIsPalindrome () {
		text = new Text("anna");
		assertEquals(true, text.isPalindrome());
	}
	
	@Test
	public void testIfAnUpperCaseWordIsPalindrome(){
		text = new Text("Anna");
		assertEquals(true, text.isPalindrome());
	}
	
	@Test
	public void testIfOddNumberLetterWordIsPalindrome(){
		text = new Text("radar");
		assertEquals(true, text.isPalindrome());
	}
	
	@Test
	public void testIfAWordWithSpecialCharacterIsPalindrome(){
		text = new Text("A?nn #a+");
		assertEquals(true, text.isPalindrome());
	}
	
	@Test
	public void testIfWithSpecialEndingIsPalindrome(){
		text = new Text("#Anna#");
		assertEquals(true, text.isPalindrome());
	}
	
	@Test
	public void testIfEmptyStringReturnsFalse() {
		text = new Text("");
		assertEquals(false, text.isPalindrome());
	}
	
	@Test
	public void testIfNullStringReturnsFalse() {
		text = new Text(null);
		assertEquals(false,text.isPalindrome());
	}
	
	@Test
	public void testIfAWordContainsPalindrome(){
		text = new Text("kapa");
		assertEquals(true, text.containsPalindrome());
	
	}
}
