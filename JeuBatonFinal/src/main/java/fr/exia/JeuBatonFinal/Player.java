package fr.exia.JeuBatonFinal;

import java.util.Random;
import java.util.Scanner;

public class Player {

	public int SoustractionNumber;
	public static Stick stick;

	public Player(Stick stick) {
		SoustractionNumber = 0;
		setStick(stick);
	}

	public void IA() {
		setSoustractionNumber(new Random().nextInt(3) + 1);
		System.out.println("L'ordinateur retire "+SoustractionNumber+" bâton(s).");
		stick.Soustraction(SoustractionNumber);
	}

	public int getSoustractionNumber() {
		return SoustractionNumber;
	}

	public void PlayerTurn() {
		System.out.println("A vous de jouer " + stick.getStickNumber());
		Scanner sc = new Scanner(System.in);
		int scan = sc.nextInt();
		if(scan != 1 && scan != 2 && scan != 3) {
			do {
				System.out.println("Le nombre doit être compris entre 1 et 3.");
				scan = sc.nextInt();
			}while(scan != 1 && scan != 2 && scan != 3);

			setSoustractionNumber(scan);
			stick.Soustraction(SoustractionNumber);
		} else {
			setSoustractionNumber(scan);
			stick.Soustraction(SoustractionNumber);
		}
		System.out.println("Vous avez retiré "+scan+" bâton(s).");
	}

	public void setSoustractionNumber(int soustractionNumber) {
		SoustractionNumber = soustractionNumber;
	}

	public static Stick getStick() {
		return stick;
	}

	public static void setStick(Stick stick) {
		Player.stick = stick;
	}

}
