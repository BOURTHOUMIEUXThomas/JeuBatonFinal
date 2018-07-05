/**
 * 
 */
package fr.exia.JeuBatonFinal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author btxth
 *
 */
public class StickTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link fr.exia.JeuBatonFinal.Stick#Soustraction(int)}.
	 */
	@Test
	public void testSoustraction() {
		Stick stick = new Stick();
		stick.setStickNumber(20);
		stick.Soustraction(5);
		assertEquals(15, stick.getStickNumber());
	}

	/**
	 * Test method for {@link fr.exia.JeuBatonFinal.Stick#getStickNumber()}.
	 */
	@Test
	public void testGetStickNumber() {
		Stick stick = new Stick();
		stick.setStickNumber(20);
		assertEquals(20, stick.getStickNumber());
	}

	/**
	 * Test method for {@link fr.exia.JeuBatonFinal.Stick#setStickNumber(int)}.
	 */
	@Test
	public void testSetStickNumber() {
		Stick stick = new Stick();
		stick.setStickNumber(20);
		assertEquals(20, stick.getStickNumber());
	}

}
