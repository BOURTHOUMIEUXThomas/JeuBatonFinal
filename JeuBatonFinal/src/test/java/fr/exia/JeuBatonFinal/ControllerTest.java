package fr.exia.JeuBatonFinal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetIa() {
		Controller controller = new Controller();
		Player player = new Player(null);
		controller.setIa(player);
		assertEquals(player, controller.getIa());
	}

	@Test
	public void testGetPlayer() {
		Controller controller = new Controller();
		Player player = new Player (null);
		controller.setPlayer(player);
		assertEquals(player, controller.getPlayer());
	}

	@Test
	public void testGetStick() {
		Controller controller = new Controller ();
		Stick stick = new Stick();
		controller.setStick(stick);
		assertEquals(stick, controller.getStick());
	}

	@Test
	public void testSetStick() {
		Controller controller = new Controller ();
		Stick stick = new Stick();
		controller.setStick(stick);
		assertEquals(stick, controller.getStick());
		
		
	}

}
