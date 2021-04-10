package java_test;

import java.awt.Graphics;
//import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;

	public Fenetre(){
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(1000, 750);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(new Panneau());
	    this.setVisible(true);
//	    JPanel pan = new JPanel();
//	    pan.setBackground(Color.BLUE);
//	    this.setContentPane(pan);
	  }

public class Panneau extends JPanel {
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g){
		//Vous verrez cette phrase chaque fois que la méthode sera invoquée
		System.out.println("Je suis exécutée !");
		g.fillOval(500, 375, 75, 75);
	}
}

public static void main(String[] args){

	Fenetre fen = new Fenetre();

  }
}