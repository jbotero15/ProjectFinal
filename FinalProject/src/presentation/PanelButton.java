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
	 * Contante del alto del panel ////
	 * Constant heigth panel
	 */
	public static int DEFAULT_HEIGTH = 100 ;
	/**
	 * Cosntante del ancho del panel ////////
	 * Constant width panel
	 */
	public static int DEFAULT_WIDTH = 5 ;
	
	//------------Atributes-----------------
	 /**
	  * Atributo del boton iniciar //// 
	  * Attribute button start
	  */
	private JButton btnStar ;
	/**
	 * Atributo del boton pausar.//////
	 * Attribute the pause button
	 */
	private JButton btnPause;
	/**
	 * Atributo boton reiniciar/////7
	 * Attribute reset button
	 */
	private JButton btnReset;
	//------------Builders------------------
	
	/**
	 * Cosntructor donde se va a crear los botones en el panel//
	 * Constructor which will create the buttons on the panel.
	 */
	public PanelButton() {
		/**
		 * Este espara gregarle el titulo en l aprte superior del panel //
		 * This is to add the title at the top of the panel
		 */
		TitledBorder border = BorderFactory.createTitledBorder("Botones Controladores");
		/**
		 * Color de la letra del Tittle Border
		 * Letter Color Border Tittle
		 */
		border.setTitleColor(Color.black);
		/**
		 * Asignar el Border al Tittle //
		 * Assign the Border Title
		 */
		setBorder(border);
		/**
		 * GridLayout situa los componente dentro del panel dependiendo  de como fue construido//
		 * GridLayout places components inside the panel depending on how it was built
		 */
		setLayout(new GridLayout(1,3));
		/**
		 * Dimension del panel en la ventana principal///
		 * Dimension of the panel in the main window
		 * MIRAR PARA QUE SIRVE EL SETPREFERREDSIZE
		 */
		setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGTH));
		/**
		 * Color del panel para diferencialos del principal///////////
		 * Color panel to differentiate the main.
		 */
		setBackground(Color.decode("#01A9DB"));
		
		/**
		 * Crear el boton Star /////////////
		 * Create button Star.
		 */
		btnStar = new JButton("INICIAR");
		/**
		 * Asignarlo al panel]//////////
		 * assign the panel
		 */
		this.add(btnStar);
		
		/**
		 * Crear el boton Pausar.((((((((
		 * Create the pause button
		 */
		btnPause = new JButton("PAUSAR");
		/**
		 * Asinar el boton Pausar////////
		 * Assign the Pause Button
		 */
		this.add(btnPause);
		
		/**
		 * Crear el boton Reiniciar
		 * Creating the Reset button
		 */
		btnReset = new JButton("REINICIAR");
		/**
		 * Asignar el boton al panel /////////
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
