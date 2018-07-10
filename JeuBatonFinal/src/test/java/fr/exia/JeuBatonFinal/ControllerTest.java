package fr.exia.JeuBatonFinal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.JeuBatonFinal.controller.Controller;
import fr.exia.JeuBatonFinal.model.Player;
import fr.exia.JeuBatonFinal.model.Stick;

public class ControllerTest {
	
	private Controller controller;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.controller = new Controller();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetIa() {
		Player player = new Player(null);
		controller.setIa(player);
		assertEquals(player, controller.getIa());
	}

	@Test
	public void testGetPlayer() {
		Player player = new Player (null);
		controller.setPlayer(player);
		assertEquals(player, controller.getPlayer());
	}

	@Test
	public void testGetStick() {
		Stick stick = new Stick();
		controller.setStick(stick);
		assertEquals(stick, controller.getStick());
	}

	@Test
	public void testSetStick() {
		Stick stick = new Stick();
		controller.setStick(stick);
		assertEquals(stick, controller.getStick());
	}
	
	@Test
	public void testIsWinner() {
		controller.setWinner(true);
		assertEquals(true, controller.isWinner());
	}
	
	
	@Test
	public void testSetWinner() {
		controller.setWinner(true);
		assertEquals(true, controller.isWinner());
	}

}
