package presentation;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import logic.Game;
/**
 * Main window where the panels are created in this
 * @author Jenny Paola Quesada Hernandez.
 */

public class MainWindow extends JFrame implements KeyListener{
	//------------------Constants----------------
	/**
	 * Constant to define the top of the main window
	 */
	public static int DEFAULT_WIDTH = 800 ;
	/**
	 * Constant to define the width of the main window.
	 */
	public static int DEFAULT_HEIGTH = 600;
	/**
	 * Constant that defines the name of the game window.
	 */
	public static String DEFAULT_NAME = "JUEGO DE GEOMETRIA" ;
	//------------------Attributes---------------
	/**
	 * Attribute used by the GamePanel class
	 */
	private GamePanel gamePanel;
	/**
	 * Attribute Buttons that use the Panel class.
	 */
	private PanelButton panelButton;
	/**
	 * Attribute used by the Information Panel class
	 */
	private PanelInformation panelInformation;
	/**
	 *Direct connection of logic with interface
	 */
	private Game game;
	
	//------------------Builders-----------------
	/**
	 * Constructor where it will build the main window.
	 */
	public MainWindow() {
		/**
		 * Title of the Main Window
		 */
		setTitle(DEFAULT_NAME);
		/**
		 *  Width and height of the main window definidas a constant.
		 */
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		/**
		 * Action when the window is closed completely finished run.
		 */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/**
		 * is the one that decides the positions of the buttons.
		 */
		setLayout(new BorderLayout());
		/**
		 * This condition is for the window can not be maximized
		 */
		setResizable(false);
		
		this.addKeyListener(this);
		/**
		 * created new game within the panel
		 */
		game =new Game();
		/**
		 * It creates the Buttons
		 */
		panelButton = new PanelButton();
		/**
		 * This assigning to the main window's position South.
		 */
		this.add(panelButton,BorderLayout.SOUTH);
		/**
		 *The panel was created Game
		 */
		gamePanel = new GamePanel(game);
		/**
		 * This assigning the game panel in the main window center.
		 */
		this.add(gamePanel,BorderLayout.CENTER);
		/**
		 * the key listener is added to the panel where moviemientos are made
		 */
		gamePanel.addKeyListener(this);
		/**
		 * PREGUNTAR PARA QUE SIRVE EN SI EL SETFOCUSABLE
		 */
		gamePanel.setFocusable(true);
		/**
		 * Information panel is created
		 */
		
		panelInformation = new PanelInformation();
		/**
		 * The information panel to the main window is assigned to the East
		 */
		this.add(panelInformation,BorderLayout.EAST);
		
	}
	//------------------Methods------------------
	/**
	 * I generated the key listener method,Keyboard key listener hears
	 */
	@Override
	public void keyPressed(KeyEvent key) {
		/**
		 * option to move up the personaje
		 */
		if (key.getKeyCode() == KeyEvent.VK_UP) {
			game.getPlayer().moveUp();
		/**
		 * option of moving down the personaje
		 */
		}else if(key.getKeyCode() == KeyEvent.VK_DOWN) {
			game.getPlayer().moveDown();
		/**
		 * option to move left personaje
		 */
		}else if(key.getKeyCode() == KeyEvent.VK_LEFT) {
			game.getPlayer().moveLeft();
			/**
			 * option to move right personaje
			 */
		}else if(key.getKeyCode() == KeyEvent.VK_RIGHT) {
			game.getPlayer().moveRight();
			System.out.println("ab");
		/**
		 * option to move up the villain
		 */
		}else if(key.getKeyCode()==KeyEvent.VK_E){
		game.getVillain().moveUp();
		/**
		 * option of moving down the villain
		 */
		}else if(key.getKeyCode() == KeyEvent.VK_X){
		game.getVillain().moveDown();
		/**
		 * option to move right villain
		 */
		}else if(key.getKeyCode()== KeyEvent.VK_S){
			game.getVillain().moveRight();
		/**
		 * option to move left villain
		 */
		}else if(key.getKeyCode()==KeyEvent.VK_F){
			game.getVillain().moveLeft();
			
		}
		
		/**
		 * Figure is repainted
		 */
		gamePanel.repaint();
		
	}
		
	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
