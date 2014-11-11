package presentation;

import java.awt.BorderLayout;

import javax.swing.JFrame;
/**
 * Ventana principal donde estaran los paneles creados en este ///////
 * Main window where the panels are created in this
 * @author Jenny Paola Quesada Hernandez.
 *
 */

public class MainWindow extends JFrame {
	//------------------Constants----------------
	/**
	 * Constant to define the top of the main window
	 */
	public static int DEFAULT_WIDTH = 800 ;
	/**
	 * Constante ára definir el alto de la ventana principal.////
	 * Constant to define the width of the main window.
	 */
	public static int DEFAULT_HEIGTH = 600;
	/**
	 * Constante que defina el nombre de la ventana Juego//////
	 * Constant that defines the name of the game window.
	 */
	public static String DEFAULT_NAME = "JUEGO DE GEOMETRIA" ;
	//------------------Attributes---------------
	/**
	 * Atributo que utiliza la clase Game Panel ////
	 * Attribute used by the GamePanel class
	 */
	private GamePanel gamePanel;
	/**
	 * Atributo que utiliza de la clase Panel Buttons .////
	 * Attribute Buttons that use the Panel class.
	 */
	private PanelButton panelButton;
	/**
	 * Atributo que utiliza la clase Panel Information///////////////////////
	 * Attribute used by the Information Panel class
	 */
	private PanelInformation panelInformation;
	
	//------------------Builders-----------------
	/**
	 * Cosntructor donde se va a construir la ventana principal/////////////
	 * Constructor where it will build the main window.
	 */
	public MainWindow() {
		/**
		 * Titulo de la ventana principal//////
		 * Title of the Main Window
		 */
		setTitle(DEFAULT_NAME);
		/**
		 * Ancho y alto de la ventana principal defiinidas en una constante.//////
		 *  Width and height of the main window defiinidas a constant.
		 */
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		/**
		 * Accion para cuando se cierre la ventana  termine de ejecutarse completamente //////
		 * Action when the window is closed completely finished run.
		 */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/**
		 * es aquella que decide las posiciones de los botones ////
		 * is the one that decides the positions of the buttons.
		 */
		setLayout(new BorderLayout());
		/**
		 * Esa condicion sirve para que la ventana no pueda maximizarse//////////////
		 * This condition is for the window can not be maximized
		 */
		setResizable(false);
		/**
		 * Se crea el panel de botones dentro de la ventana principal///////////////
		 * The button panel is created within the main window
		 */
		/**
		 * Se crea el panel Botones//
		 * It creates the Buttons
		 */
		panelButton = new PanelButton();
		/**
		 * Esta asignando a la ventana principal la posicion del Sur///
		 * This assigning to the main window's position South.
		 */
		this.add(panelButton,BorderLayout.SOUTH);
		/**
		 *Se crea el panel Juego /////
		 *The panel was created Game
		 */
		gamePanel = new GamePanel();
		/**
		 * Esta asignando el panel del juego en la vanetna principal en el centro.//
		 * This assigning the game panel in the main window center.
		 */
		this.add(gamePanel,BorderLayout.CENTER);
		/**
		 * Se crea el panel informacion////
		 * Information panel is created
		 */
		
		panelInformation = new PanelInformation();
		/**
		 * Se asigna el panel informacion a la ventana principal en el Oriente.
		 * The information panel to the main window is assigned to the East
		 */
		this.add(panelInformation,BorderLayout.EAST);
		
	}
	//------------------Methods------------------
	
	//------------------Gets&Set-----------------
	
	//Main 
	/**
	 * Test de prueba este sera removido 
	 */
	
	public static void main(String[] args) {
		
		MainWindow mainWindow = new MainWindow();
	//	mainWindow.setVisible(true);
	}
	
}
