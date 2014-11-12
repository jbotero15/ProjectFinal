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
	 * command button to play
	 */
	public static final String COMMAND_BTN_PLAY = "Boton Jugar";
	/**
	 * command button to lenguage
	 */
	public static final String COMMAND_BTN_LENG ="Boton Lenguaje";
	/**
	 * command button to score
	 */
	public static final String COMMAND_BTN_SCR = "Boton Puntaje";
	/**
	 * command Button exit
	 */
	public static final String COMMAND_BTN_EXIT= "Boton Salir";
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
	 * handler attribute buttons
	 */
	private EventHandler event;
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
	public WindowMenu(EventHandler events) {
	
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
		/**
		 * button has action
		 */
		btnPlay.setActionCommand(COMMAND_BTN_PLAY);
		btnPlay.addActionListener(events);
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
		/**
		 * button has action
		 */
		btnLenguage.setActionCommand(COMMAND_BTN_LENG);
		btnLenguage.addActionListener(events);
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
		/**
		 * button has action
		 */
		btnScore.setActionCommand(COMMAND_BTN_SCR);
		btnScore.addActionListener(events);
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
		btnExit.addActionListener(events);
		/**
		 * button has action
		 */
		this.add(btnExit);
	
		
	}
	//--------------Methods-----------------
	//--------------Gets&Sets---------------
	/**
	 * Main de prueba de esta ventana
	 */
	public static void main(String[] args) {
		
	//	WindowMenu windowMenu = new WindowMenu();
		//windowMenu.setVisible(true);
		
		
	} 
}
