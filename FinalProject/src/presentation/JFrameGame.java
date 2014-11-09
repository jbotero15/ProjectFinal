package presentation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import logic.Game;

public class JFrameGame extends JFrame implements KeyListener{

	private Game game;
	
	public JFrameGame() {
		game = new Game();
		this.addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent key) {
		if (key.getKeyCode() == KeyEvent.VK_UP) {
			game.getPlayer().moveUp();
		}else if(key.getKeyCode() == KeyEvent.VK_DOWN) {
			game.getPlayer().moveDown();
		}else if(key.getKeyCode() == KeyEvent.VK_LEFT) {
			game.getPlayer().moveLeft();
		}else if(key.getKeyCode() == KeyEvent.VK_RIGHT) {
			game.getPlayer().moveRight();
		}
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
