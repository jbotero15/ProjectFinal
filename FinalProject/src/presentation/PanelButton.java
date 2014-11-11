package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Clase donde ira el control de botones que tendra el juego para controlar los hilos que este contiene////
 * Class where anger control buttons that have the game to control the threads it contains.
 * @author Jenny Paola Quesada Hernandez
 *
 */

public class PanelButton extends JPanel implements KeyListener{
	//------------Constants-----------------
	/**
	 * Constant heigth panel
	 */
	public static int DEFAULT_HEIGTH = 100 ;
	/**
	 * Constant width panel
	 */
	public static int DEFAULT_WIDTH = 5 ;
	
	//------------Atributes-----------------
	 /**
	  * Attribute button start
	  */
	private JButton btnStar ;
	/**
	 * Attribute the pause button
	 */
	private JButton btnPause;
	/**
	 * Attribute reset button
	 */
	private JButton btnReset;
	//------------Builders------------------
	
	/**
	 * Constructor which will create the buttons on the panel.
	 */
	public PanelButton() {
		/**
		 * This is to add the title at the top of the panel
		 */
		TitledBorder border = BorderFactory.createTitledBorder("Botones Controladores");
		/**
		 * Letter Color Border Tittle
		 */
		border.setTitleColor(Color.black);
		/**
		 * Assign the Border Title
		 */
		setBorder(border);
		/**
		 * GridLayout places components inside the panel depending on how it was built
		 */
		setLayout(new GridLayout(1,3));
		/**
		 * Dimension of the panel in the main window
		 * MIRAR PARA QUE SIRVE EL SETPREFERREDSIZE
		 */
		setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGTH));
		/**
		 * Color panel to differentiate the main.
		 */
		setBackground(Color.decode("#01A9DB"));
		
		/**
		 * Create button Star.
		 */
		btnStar = new JButton("INICIAR");
		/**
		 * assign the panel
		 */
		this.add(btnStar);
		
		/**
		 * Create the pause button
		 */
		btnPause = new JButton("PAUSAR");
		/**
		 * Assign the Pause Button
		 */
		this.add(btnPause);
		
		/**
		 * Creating the Reset button
		 */
		btnReset = new JButton("REINICIAR");
		/**
		 * Assign the button panel
		 */
		this.add(btnReset);
	}
	
	//------------Methods-------------------
	
	//
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
	//------------Gets&Sets-----------------
}
