package presentation;

import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * Clase donde ira lo spuntaje s de los jugadores que ingresaron a la aplicacion //////7
 * @author Jenny Paola Quesada Hernnadez
 *
 */

public class WindowScore extends JDialog {
	//----------------Constants--------
	/**
	 * Ancho de la ventana puntaje
	 */
	private static int DEFAULT_WIDTH= 600;
	/**
	 * alto de la ventana puntaje.
	 */
	private static int DEFAULT_HEIGTH = 400;
	/**
	 * Nombre del aventana  del puntaje
	 */
	private static String DEFAULT_NAME = "PUNTAJES ALTOS" ;
	/**
	 * Nombre del label Jugador
	 */
	private static String DEFAULT_NAME_PLY = "JUGADOR" ;
	/**
	 * Nombre del label puntaje
	 */
	private static String DEFAULT_NAME_SCO = "PUNTAJE" ;
	
	
	//----------------Attributes-------
	/**
	 * lABEL DONDE IRA EL NOMBRE DE LOS JUGADORES
	 */
	private JLabel lbName;
	/**
	 * Label donde ira los puntajes de los jugadores
	 */
	private JLabel lbScore;
	
	//----------------Builders---------
	/**
	 * Cosntructor de como qudara la ventana de puntajes
	 */
	public WindowScore() {
		/**
		 * JDialog Title
		 */
		setTitle(DEFAULT_NAME);
		/**
		 * Size panel
		 */
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGTH);
		/**
		 * Ubicacion de los botones por defecto
		 */
		setLayout(null);
		
		
		/**
		 * Add Name Label
		 */
		lbName = new JLabel(DEFAULT_NAME_PLY);
		lbName.setBounds(50,50 ,70,30);
		this.add(lbName);
		
		/**
		 * Add Score label
		 */
		lbScore = new JLabel(DEFAULT_NAME_SCO);
		lbScore.setBounds(50,100,70,30);
		this.add(lbScore);
		
	}
	//----------------Methods----------
	//----------------Gets&Sets--------
	
	public static void main(String[] args) {
		WindowScore uh = new WindowScore();
		uh.setVisible(true);
	}

}
