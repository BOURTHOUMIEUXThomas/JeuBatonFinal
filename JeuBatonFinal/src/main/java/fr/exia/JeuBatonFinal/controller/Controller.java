package fr.exia.JeuBatonFinal.controller;

import java.util.Scanner;

import fr.exia.JeuBatonFinal.model.Player;
import fr.exia.JeuBatonFinal.model.Stick;
import fr.exia.JeuBatonFinal.view.Frame;

/**
 * Classer controller c'est elle qui va gerer le jeu  , le lancement le deroulement ect
 * @author btxth
 *
 */
public class Controller {

	/**
	 * Player ia est l'ordinateur pour le choix de jeu
	 */
	public Player ia;
	/**
	 * Player est le joueur 1 ou 2, ils s'alternent en cas de joueur vs joueur
	 */
	public Player player;
	/**
	 * Winner est pour celui qui a gagné boolean car il prends deux valeur soit winner soit loser (true or false)
	 */
	public boolean Winner;
	/**
	 * Stick est le nombre de bâtons 
	 */
	public Stick stick;
	/**
	 * Turn est le tour du jouer pareil boolean
	 */
	public boolean turn;
	/**
	 * oponent est le tour du joueur 2 (vu qu'on utilise deux fois la meme methode on utilise oponent pour différencier les deux
	 */
	public int oponent;

	/**
	 * Constructeur du controller // instantiation du stick et des joueurs/ia
	 */
	public Controller() {
		stick = new Stick();
		player = new Player(stick);
		ia = new Player(stick);

	}

	/**
	 * Tour du joueur avec le check de la victoire et le choix du joueur
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
	
	/**
	 * Annonce du perdant / victorieux
	 */
	public void AndTheWinnerIs() {
		if (this.isWinner() == false) {
			System.out.println("gagné");
		} else {
			System.out.println("Perdu");
		}
	}

	/**
	 * Méthode start qui guidera le joueur dans la console
	 */
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

	/**
	 * Méthode qui affiche le nombre de stick et le nombre de stick que l'ia a enlever
	 * @param stickIA il prends en paramètre le nombre de stick que l'ia a enlever
	 * @return le nombre de stick de l'ia
	 */
	public int IAStickSoustraction(int stickIA) {
		System.out.println("\n	Il y a " + this.getStickNumber() + "Il a enlever" + stickIA);

		return stickIA;

	}
	
	/**
	 * Set du stick
	 * @param d
	 */
	private void setStickNumber(double d) {
		// TODO Auto-generated method stub
		stick.setStickNumber((int) d);
	}
	
	/**
	 * getter du stick
	 * @return
	 */
	private int getStickNumber() {
		// TODO Auto-generated method stub
		return stick.getStickNumber();
	}
	
	/**
	 * getter de l'ia
	 * @return ia 
	 */
	public Player getIa() {
		return ia;
	}
	/**
	 * setter de l'ia
	 * @param ia le setter prends en paramètre 
	 */
	public void setIa(Player ia) {
		this.ia = ia;
	}
	/**
	 * getter du player
	 * @return player
	 */
	public Player getPlayer() {
		return player;
	}
	/**
	 * setter du player
	 * @param player le setter prends en param-tre le player (comme pour l'ia) 
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}
	/**
	 * méthode isWinner
	 * @return Winner 
	 */
	public boolean isWinner() {
		return Winner;
	}
	/**
	 * Setter du winner
	 * @param winner le setter prends en paramètre le true ou false du winner ou loser
	 */
	public void setWinner(boolean winner) {
		Winner = winner;
	}
	/**
	 * Getter du stick
	 * @return stick
	 */
	public Stick getStick() {
		return stick;
	}
	/**
	 * setter du stick
	 * @param stick le setteur prends en paramètre le nb de stick 
	 */
	public void setStick(Stick stick) {
		this.stick = stick;
	}

}
