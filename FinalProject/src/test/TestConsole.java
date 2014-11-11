package test;

import javax.swing.JFrame;

import presentation.JFrameGame;
import presentation.MainWindow;
import presentation.WindowMenu;
import logic.Game;
import logic.Matrix;
import logic.Square;

/**
 * Clase do pruebas donde se probara todo  
 * el programa por consola
 * @author Jenny Paola Quesada Hernandez
 *
 */
public class TestConsole {
	/**
	 * Metodo principal de programa para que se ejecute el programa 
	 * @param string
	 */
	public static void main(String[] string) {
		JFrameGame frameGame = new JFrameGame();
	//	frameGame.setVisible(true);
		
		WindowMenu windowMenu = new WindowMenu();
		windowMenu.setVisible(true);
	}

}
