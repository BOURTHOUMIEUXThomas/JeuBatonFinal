package fr.exia.JeuBatonFinal.model;
/**
 * 
 * @author btxth
 *
 */
public class Stick {

	public int StickNumber;

	public Stick() {}

	public void Soustraction(int SoustractionNumber) {
		this.setStickNumber(this.getStickNumber() - SoustractionNumber);
	}

	public int getStickNumber() {
		return StickNumber;
	}

	public void setStickNumber(int sticknumber) {
		StickNumber = sticknumber;
	}

}
