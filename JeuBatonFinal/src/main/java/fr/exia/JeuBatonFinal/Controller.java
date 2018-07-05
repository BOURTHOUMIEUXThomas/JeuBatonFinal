package fr.exia.JeuBatonFinal;


public class Controller {

	public  Player ia;
	public  Player player;
	public boolean Winner;
	public  Stick stick;
	
	public Controller() {
	}
	
	
	public void AndTheWinnerIs() {
		if(this.isWinner() == false) {
			System.out.println("gagné");
		}else {
			System.out.println("Perdu");
		}
	}
	
	public int Start() {
		this.setStickNumber(20);
		System.out.println("\nNombre de batons" + this.getStickNumber());
		return stick.getStickNumber();
	}
	
	
	public int IAStickSoustraction (int stickIA) {
		 System.out.println("\n	Il y a " + this.getStickNumber() + "Il a enlever" + stickIA);
		 

		return stickIA;
		
	}
	
	
	
	
	private void setStickNumber(int StickNumber) {
		// TODO Auto-generated method stub
		stick.setStickNumber(StickNumber);
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
	
	
	
	public int getReplay() {
		return Replay;
	}
	
	
	
	public void setReplay(int replay) {
		Replay = replay;
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
