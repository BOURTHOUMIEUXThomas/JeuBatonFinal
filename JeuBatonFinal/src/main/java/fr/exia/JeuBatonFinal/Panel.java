package fr.exia.JeuBatonFinal;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private Stick stick;
	
	public Panel(Stick stick) {
		this.stick = stick;
	}
	
	@Override
	public void paint(Graphics g) {
		super.repaint();
		
		g.clearRect(0, 0, 200, 200);
		
		g.drawString("Bâtons restants : "+stick.getStickNumber(), 20, 20);
		
		final Thread thread = new Thread(new Runnable() {

			public void run() {
				try {
					Thread.sleep(20);
					repaint();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		thread.start();
	}

}