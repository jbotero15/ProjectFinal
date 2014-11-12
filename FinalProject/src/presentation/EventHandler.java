package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Management class where the buttons will be made
 * @author Jenny Paola Quesada Hernandez
 */

public class EventHandler implements ActionListener {
	//--------------Attributes-------------------
	/**
	 * entry window
	 */
	private InputWindow inputWindow;
	/**
	 * window menu
	 */
	private WindowMenu windowMenu;
	/**
	 * Game window
	 */
	private MainWindow mainWindow;
	/**
	 * language window
	 */
	private WindowLenguage winLeng;
	/**
	 * score window
	 */
	private WindowScore winScore;
	/**
	 * button panel
	 */
	private PanelButton panelButton;
	
	//--------------Builders---------------------
	/**
	 * is created according to each application window
	 */
	public EventHandler(InputWindow inWin) {
		this.inputWindow = inWin;
		mainWindow = new MainWindow();
		
		
		panelButton = new PanelButton();
		winLeng= new WindowLenguage();
		windowMenu = new WindowMenu(this);
		winScore= new WindowScore();
		
		
	}
	//--------------Methods----------------------
	

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		switch (event.getActionCommand()) {
		case InputWindow.COMMAND_BUTTON_ENTER:
			showMenu();
			break;
		case WindowMenu.COMMAND_BTN_PLAY:
			showGame();
			break;
		case WindowMenu.COMMAND_BTN_LENG:
			showLenguage();
			break;
		case WindowMenu.COMMAND_BTN_SCR:
			showScore();
			break;
		case WindowMenu.COMMAND_BTN_EXIT:
			exit();
		default:
			
			break;
		}
		
	}
	
	/**
	 * Show window menu method
	 */
	public void showWindow(){
	windowMenu.setVisible(true);
	}
	/**
	 * show window lenguage method
	 */
	public void showLenguage(){
		winLeng.setVisible(true);
	}
	/**
	 * show window score method
	 */
	public void showScore(){
		winScore.setVisible(true);
	}
	/**
	 * show window game method
	 */
	public void showGame(){
		mainWindow.setVisible(true);
	}
	/**
	 * show window menu method
	 */
	public void showMenu(){
		windowMenu.setVisible(true);
	}
	/**
	 * Exit Window
	 */
	public void exit(){
		mainWindow.setVisible(false);
	}
	
	//--------------Gets&Sets--------------------
}
