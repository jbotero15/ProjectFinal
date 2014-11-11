package presentation;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Class where is the menu of the application
 * @author Jenny Paola Quesada Hernandez
 */

public class WindowMenu extends JDialog{
	//--------------Constants---------------
	/**
	 * Constant name of the window
	 */
	private static String DEFAULT_NAME = "JUEGO GEOMETRIA" ;
	/**
	 * Constant width of the window
	 */
	private static int DEFAULT_WIDTH = 800;
	/**
	 * Constant heigth of the windows
	 */
	private static int DEFAULT_HEIGTH = 600;
	/**
	 * constant start button name
	 */
	private static String DEFAUL_NAME_B ="JUGAR";
	/**
	 * constant language button name
	 */
	private static String DEFAUL_LEN_B ="LENGUAJE";
	/**
	 * Constant score button name
	 */
	private static String DEFAUL_SCO_B ="PUNTAJE";
	/**
	 * constant name out button
	 */
	private static String DEFAUL_SALIR_B ="SALIR"; 
	/**
	 * Constant color panel
	 */
	private static String DEFAULT_COLOR = "#2ECCFA";
	
	//--------------Attributes--------------
	 /**
	  * Play button
	  */
	private JButton btnPlay;
	/**
	 * language button
	 */
	private JButton btnLenguage;
	/**
	 * scores button
	 */
	private JButton btnScore;
	/**
	 * exit button.
	 */
	private JButton btnExit;
	//--------------Builders----------------
	/**
	 * Menu Builder panel
	 */
	public WindowMenu() {
		/**
		 * Size JDialog
		 */
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGTH);
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
		setLayout(null);
	
		
		/**
		 * Add button to play
		 */
		
		btnPlay = new JButton(DEFAUL_NAME_B);
		/**
		 * Size button
		 */
		btnPlay.setBounds(300, 20, 150, 80);
		/**
		 * Color Button
		 */
		btnPlay.setBackground(Color.decode("#FFFF00"));
		this.add(btnPlay);
		
		/**
		 * Add language button
		 */
		btnLenguage = new JButton(DEFAUL_LEN_B);
		/**
		 * Size button
		 */
		btnLenguage.setBounds(300,150, 150, 80);
		/**
		 * Color Button
		 */
		btnLenguage.setBackground(Color.decode("#80FF00"));
		this.add(btnLenguage);
		
		/**
		 * Add scores button
		 */
		btnScore = new JButton(DEFAUL_SCO_B);
		/**
		 * size Button
		 */
		btnScore.setBounds(300, 280, 150, 80);
		/**
		 * Color Button
		 */
		btnScore.setBackground(Color.decode("#FE9A2E"));
		this.add(btnScore);
		
		/**
		 * Add exit button
		 */
		btnExit = new JButton(DEFAUL_SALIR_B);
		/**
		 * size Button
		 */
		btnExit.setBounds(300, 410, 150, 80);
		btnExit.setBackground(Color.decode("#000FF"));
		this.add(btnExit);
	
		
	}
	//--------------Methods-----------------
	//--------------Gets&Sets---------------
	/**
	 * Main de prueba de esta ventana
	 */
	public static void main(String[] args) {
		
		WindowMenu windowMenu = new WindowMenu();
		windowMenu.setVisible(true);
		
		
	} 
}
