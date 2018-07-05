package fr.exia.JeuBatonFinal;

public class Stick {

		public int StickNumber;
		
		public Stick() {
			// TODO Auto-generated constructor stub
		}
		
		public int Soustraction  (int SoustractionNumber){
			this.setStickNumber(this.getStickNumber() - SoustractionNumber);
			return this.getStickNumber();
			
		}
		
		public int getStickNumber() {
			return StickNumber;
		}

		public void setStickNumber(int sticknumber) {
			StickNumber = sticknumber;
		}

		
		
		
}
