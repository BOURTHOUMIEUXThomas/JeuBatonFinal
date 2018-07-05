package fr.exia.JeuBatonFinal;


public class Controller {

	public  Player ia;
	public  Player player;
	public boolean Winner;
	public  Stick stick;
	public boolean turn; 
	public Controller() {
		stick = new Stick();
		player = new Player(stick);
		ia = new Player(stick);
		
	}
	
	public void NewTurn() {
		if (turn == true) {
			if(stick.getStickNumber() == 1) {
				Winner = true;
				AndTheWinnerIs();
				System.exit(0);
			} else {

				player.PlayerTurn();
				turn = false;
			}
		} else { 
			if(stick.getStickNumber() == 1) {
				Winner = false;
				AndTheWinnerIs();
				System.exit(0);
			} else {
				player.IA();
				turn = true;
			}
		}
		NewTurn(); 
		
	}
	public void AndTheWinnerIs() {
		if(this.isWinner() == false) {
			System.out.println("gagné");
		}else {
			System.out.println("Perdu");
		}
	}
	
	public void Start() {
		this.setStickNumber(20);
		System.out.println("\nNombre de batons " + this.getStickNumber());
		turn = true;
		new Frame(stick);
		NewTurn();
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
