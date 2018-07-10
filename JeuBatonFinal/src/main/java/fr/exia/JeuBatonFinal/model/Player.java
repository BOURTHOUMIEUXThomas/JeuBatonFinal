package fr.exia.JeuBatonFinal.model;

import java.util.Random;
import java.util.Scanner;
/**
 * Classe player du package model
 * @author btxth
 *
 */
public class Player {
	/**
	 * SoustractionNumber = le nombre qu'on soustrait au nombre de baton de base du jeu. 
	 */
	public int SoustractionNumber;
	/**
	 * Stick = Batons 
	 */
	public static Stick stick;
	/**
	 * méthode player ou on initialise le nb de soustraction a 0 qu'on chabgera ensuite poar l'entrée clavier
	 * @param stick il prends le nb de stick en paramètre pour pouvoir ensuite lui soustraire le nb de batons a enlever
	 */
	public Player(Stick stick) {
		SoustractionNumber = 0;
		setStick(stick);
	}
	/**
	 * Ia qui soustrait un nb random de 1 à 3 et qui l'affiche dans la console 
	 */
	public void IA() {
		setSoustractionNumber(new Random().nextInt(3) + 1);
		System.out.println("L'ordinateur retire " + SoustractionNumber + " bâton(s).");
		stick.Soustraction(SoustractionNumber);
	}
	/**
	 * getter du soustraction number
	 * @return SoustractionNumber
	 */
	public int getSoustractionNumber() {
		return SoustractionNumber;
	}
	/**
	 * tour du joueur avec demande du nb a retirer de baton et il vérifie si il a entré un nb entre 1 et 3 et met a jour le soustractin number et le nombre de batons
	 */
	public void PlayerTurn() {
		System.out.println("Il reste " + stick.getStickNumber() + " bâton(s).");
		System.out.println("A vous de jouer :");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int scan = sc.nextInt();
		if (scan != 1 && scan != 2 && scan != 3) {
			do {
				System.out.println("Le nombre doit être compris entre 1 et 3.");
				scan = sc.nextInt();
			} while (scan != 1 && scan != 2 && scan != 3);

			setSoustractionNumber(scan);
			stick.Soustraction(SoustractionNumber);
		} else {
			setSoustractionNumber(scan);
			stick.Soustraction(SoustractionNumber);
		}
		System.out.println("Vous avez retiré " + scan + " bâton(s).");
	}
	/**
	 * setter du soustraction number 
	 * @param soustractionNumber le setter prends en paramètre SoustractionNumber
	 */
	public void setSoustractionNumber(int soustractionNumber) {
		SoustractionNumber = soustractionNumber;
	}
	/**
	 * getter du stick 
	 * @return stick
	 */
	public Stick getStick() {
		return stick;
	}
	/**
	 * setter du stick 
	 * @param stick setter du stick prends le nb de stick en paramètre
	 */
	public void setStick(Stick stick) {
		Player.stick = stick;
	}

}
