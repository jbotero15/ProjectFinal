package presentation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import logic.Game;

/**
 * Panel de la ventana principal,donde ira la ejecucuion del juego.//
 * Panel of the main window, where anger running the game.
 * @author Jenny Paola Quesada Hernandez
 *
 */

public class GamePanel extends JPanel implements KeyListener {
	
	//-------------Atributes----------------
	/**
	 * Atributo de tipo Juego donde se encuentra la conexión con la lógica.///
	 * Attribute type game where the connection is with the logic.
	 */
	private Game game;
	//-------------Builders-----------------
	/**
	 * Constructor donde se va ha crear lo que va dentro de esta ventana//tttt
	 * Constructor where he is going to create what is inside this window.
	 */
	public GamePanel() {
		
		game = new Game();
		this.addKeyListener(this);
		
	}
	//-------------Methods------------------
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	//-------------Gets&Sets----------------

}
