package fr.exia.JeuBatonFinal.controller;

import java.util.Scanner;

import fr.exia.JeuBatonFinal.model.Player;
import fr.exia.JeuBatonFinal.model.Stick;
import fr.exia.JeuBatonFinal.view.Frame;

/**
 * 
 * @author btxth
 *
 */
public class Controller {

	/**
	 * 
	 */
	public Player ia;
	
	
	public Player player;
	public boolean Winner;
	public Stick stick;
	public boolean turn;
	public int oponent;

	/**
	 * 
	 */
	public Controller() {
		stick = new Stick();
		player = new Player(stick);
		ia = new Player(stick);

	}

	/**
	 * 
	 */
	public void NewTurn() {
		if (turn == true) {
			if (stick.getStickNumber() <= 1) {
				Winner = true;
				AndTheWinnerIs();
				System.exit(0);
			} else if (stick.getStickNumber() < 1) {
				Winner = false;
				AndTheWinnerIs();
				System.exit(0);
			} else {
				player.PlayerTurn();
				turn = false;
			}
		} else {
			if (stick.getStickNumber() == 1) {
				Winner = false;
				AndTheWinnerIs();
				System.exit(0);
			} else if (stick.getStickNumber() < 1) {
				Winner = true;
				AndTheWinnerIs();
				System.exit(0);
			} else {
				if (oponent == 1) {
					player.IA();
					turn = true;
				} else {
					player.PlayerTurn();
					turn = true;
				}
			}
		}
		NewTurn();

	}

	public void AndTheWinnerIs() {
		if (this.isWinner() == false) {
			System.out.println("gagné");
		} else {
			System.out.println("Perdu");
		}
	}

	public void Start() {
		this.setStickNumber(Math.random() * 50);
		System.out.println("Nombre de batons " + this.getStickNumber());
		System.out.println("Voulez-vous jouer contre l'ordinateur (1) ou un autre joueur (2) ?");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int scan = sc.nextInt();

		if (scan != 1 && scan != 2) {
			do {
				System.out.println("Votre choix doit être compris entre 1 et 2.");
				scan = sc.nextInt();
			} while (scan != 1 && scan != 2);
		}
		oponent = scan;
		System.out.println(oponent);
		turn = true;
		new Frame(stick);
		NewTurn();
	}

	public int IAStickSoustraction(int stickIA) {
		System.out.println("\n	Il y a " + this.getStickNumber() + "Il a enlever" + stickIA);

		return stickIA;

	}

	private void setStickNumber(double d) {
		// TODO Auto-generated method stub
		stick.setStickNumber((int) d);
	}

	private int getStickNumber() {
		// TODO Auto-generated method stub
		return stick.getStickNumber();
	}

	public Player getIa() {
		return ia;
	}

	public void setIa(Player ia) {
		this.ia = ia;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean isWinner() {
		return Winner;
	}

	public void setWinner(boolean winner) {
		Winner = winner;
	}

	public Stick getStick() {
		return stick;
	}

	public void setStick(Stick stick) {
		this.stick = stick;
	}

}
