package fr.exia.JeuBatonFinal;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panel panel;
	
	public Frame(Stick stick) {
		this.panel = new Panel(stick);
		build();
	}
	
	public void build() {
		setTitle("Batons");
		setSize(532,412);
		setLocationRelativeTo(null); //Put the window in the center of the screen
		setResizable(false); //to forbid the user to resize the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the app when the user click the red cross
		setContentPane(this.panel);
		setVisible(true);
	}

}
