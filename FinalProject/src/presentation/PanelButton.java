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

public class PanelButton extends JPanel {
	//------------Constants-----------------
	/**
	 * constant button start
	 */
	private static String COMMAND_BTN_STAR = "Iniciar";
	/**
	 * command button stop
	 */
	private static String COMMAND_BTN_PAUSE ="Pausar" ;
	/**
	 * command button restart
	 */
	private static String COMMAND_BTN_REST = "Reanudar";
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
		 * button has action
		 */
		btnStar.setActionCommand(COMMAND_BTN_STAR);
		/**
		 * assign the panel
		 */
		this.add(btnStar);
		
		/**
		 * Create the pause button
		 */
		btnPause = new JButton("PAUSAR");
		
		/**
		 * button has action
		 */
		btnPause.setActionCommand(COMMAND_BTN_PAUSE);
		/**
		 * Assign the Pause Button
		 */
		this.add(btnPause);
		
		/**
		 * Creating the Reset button
		 */
		btnReset = new JButton("REINICIAR");
		/**
		 * button has action
		 */
		btnReset.setActionCommand(COMMAND_BTN_REST);
		/**
		 * Assign the button panel
		 */
		this.add(btnReset);
	}
	
	//------------Methods-------------------
	
	
	//------------Gets&Sets-----------------
}
