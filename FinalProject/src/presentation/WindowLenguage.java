package presentation;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * cLass where anger buttons lenguage choices in the application
 * @author Jenny Paola Quesada Hernandez
 *
 */

public class WindowLenguage  extends JDialog{
	//-----------------Constants---------------
	/**
	 * Ancho  de la ventana
	 */
	private static int DEFAULT_WIDTH = 300;
	/**
	 * Alto de la ventana
	 */
	private static int DEFAULT_HEIGTH = 200;
	/**
	 * CONSTANT WINDOW NAME
	 */
	private static String DEFAULT_NAME ="LENGUAJE";
	/**
	 * English name constant 
	 */
	private static String DEFAULT_ENG = "INGLES";
	/**
	 * Franch name constant
	 */
	private static String DEFAULT_NAME_FRA = "FRANCES";
	
	//-----------------Attributes--------------
	/**
	 * English button
	 */
	private JButton btnEnglish;
	/**
	 * French button
	 */
	private JButton btnFrench;
	
	
	//-----------------Builders----------------
	/**
	 * Language Builder window
	 */
	public WindowLenguage() {
		
		/**
		 * Size JDialog
		 */
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		/**
		 * Tilte JDialog
		 */
		
		setTitle(DEFAULT_NAME);
		/**
		 * panel color
		 */
		setBackground(Color.orange);
		/**
		 * position of the buttons
		 */
		setLayout(new GridLayout(2,1));
		
		/**
		 * Add Button English
		 */
		btnEnglish = new JButton(DEFAULT_ENG);
		btnEnglish.setBackground(Color.decode("#D34CD7"));
		this.add(btnEnglish);
		/**
		 * Add Button French
		 */
		btnFrench = new JButton(DEFAULT_NAME_FRA);
		btnFrench.setBackground(Color.decode("#02FA5D"));
		this.add(btnFrench);
		
	}
	//-----------------Methods-----------------
	//-----------------Gets&Sets---------------
	public static void main(String[] args) {
		WindowLenguage mai = new WindowLenguage();
		mai.setVisible(true);
	}
}
