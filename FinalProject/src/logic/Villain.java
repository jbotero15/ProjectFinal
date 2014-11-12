package logic;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase donde se encontrara  lso metodos del villano de la aplicacion
 * @author Jenny Paola Quesada Hernandez
 */

public class Villain  extends Shape {
	//---------------Constants------------
	//----------------Attributes----------
	//----------------Builders------------
	//----------------Methods-------------

	@Override
	public void generateShape(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, higth);
		
		
	}

	@Override
	public void collisonShape() {
		
		
	}
	
	//----------------Gets&Sets-----------
	

}
