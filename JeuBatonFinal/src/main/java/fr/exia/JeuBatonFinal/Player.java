package fr.exia.JeuBatonFinal;
import java.util.Random;
import java.util.Scanner;


public class Player {

	
		public int SoustractionNumber;
		public static Stick stick; 
		
		
		public Player (Stick stick) {
			SoustractionNumber = 0;
			setStick(stick);
		}
		
		
		public int IA (int StickNumber) {
			setSoustractionNumber(new Random().nextInt(3)+1);
			return this.getSoustractionNumber();
		}
		
		public int getSoustractionNumber() {
			return SoustractionNumber;
		}
		

		public int PlayerTurn() {
			Scanner sc = new Scanner(System.in);
			setSoustractionNumber(sc.nextInt());
			return getSoustractionNumber();
			
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
