package presentation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import org.omg.CORBA.VisibilityHelper;

import logic.Game;
import logic.Player;
import logic.Villain;

/**
 * Panel of the main window, where anger running the game.
 * @author Jenny Paola Quesada Hernandez
 *
 */

public class GamePanel extends JPanel{
	
	//-------------Atributes----------------
	/**
	 * Attribute type game where the connection is with the logic.
	 */
	private Game game;
	/**
	 * Attribute of class 
	 */
	private Player player ;
	/**
	 * Attribute of Class Villain
	 */
	private Villain villain;
	//-------------Builders-----------------
	/**
	 * Constructor where he is going to create what is inside this window.
	 */
	public GamePanel(Game logicGame) {
		
		game = logicGame;
		/**
		 * Panel Color game
		 */
		setBackground(Color.decode("#A5DF00"));
		
	}
	//-------------Methods------------------
	
	@Override
	public void paint(Graphics graphics) {
		
		super.paint(graphics);
	//	this.game.getPlayer().generateShape(graphics);
	//	this.game.getVillain().generateShape(graphics);
	//this.game.getSquare().generateShape(graphics);
		//this.game.getCircle().generateShape(graphics);
		//this.game.getRectangle().generateShape(graphics);
	
		
		


	}
	
	//-------------Gets&Sets----------------

	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	

}
