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

import fr.exia.JeuBatonFinal.model.Player;
import fr.exia.JeuBatonFinal.model.Stick;

/**
 * @author btxth
 *
 */
public class PlayerTest {

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
	 * Test method for {@link fr.exia.JeuBatonFinal.model.Player#getStick()}.
	 */
	@Test
	public void testGetStick() {
		Stick stick = new Stick();
		Player player = new Player (stick);
		assertEquals(stick, player.getStick());
	}

	/**
	 * Test method for {@link fr.exia.JeuBatonFinal.model.Player#setStick(fr.exia.JeuBatonFinal.model.Stick)}.
	 */
	@Test
	public void testSetStick() {
		Stick stick = new Stick();
		Player player = new Player (stick);
		assertEquals(stick, player.getStick());
	}

}
