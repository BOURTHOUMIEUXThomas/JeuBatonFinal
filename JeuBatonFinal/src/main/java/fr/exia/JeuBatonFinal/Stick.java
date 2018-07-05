package fr.exia.JeuBatonFinal;

public class Stick {

		public int StickNumber;
		
		public int Soustraction  (int SoustractionNumber){
			this.setStickNumber(this.getSticknumber() - SoustractionNumber);
			return this.getSticknumber();
			
		}
		
		public int getSticknumber() {
			return StickNumber;
		}

		public void setStickNumber(int sticknumber) {
			StickNumber = sticknumber;
		}
		
		
}
