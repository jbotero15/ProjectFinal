package logic;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Class methods where the villain of the application is found
 * @author Jenny Paola Quesada Hernandez
 */

public class Villain  extends Shape {
	//---------------Constants------------
	/**
	 * color constant figure
	 */
	private static String DEFAULT_COLOR = "#CC2EFA";
	//----------------Attributes----------
	/**
	 * Size of figure drawing
	 */
	private int size;
	//----------------Builders------------
	/**
	 * Where the figure is constructed without parameters
	 */
	public Villain() {

		setSize((width+higth)/2);
	
	}
	/**
	 * Parameter which builds the options that the user can enter
	 * @param x
	 * @param y
	 * @param width
	 * @param heigth
	 * @param character
	 */
	
	 public Villain(int x,int y, int width, int heigth,char character){
		 /**
		  * Super invokes methods of the superclass from the subclass
		  */
		 super(x,y,width,heigth);
		 setSize((width+heigth)/2);
	 }
	 /**
	  * Parameters that the user can enter
	  * @param x
	  * @param y
	  * @param width
	  * @param heigth
	  */
	 public Villain(int x, int y, int width,int heigth){
		 
		 super(x,y,width,heigth);
		 setSize((width+heigth)/2);
	 }
	//----------------Methods-------------

	@Override
	public void generateShape(Graphics graphics) {
		
		graphics.setColor(Color.decode(DEFAULT_COLOR));
		graphics.fillRect(x, y, width, higth);
		
		
	}

	@Override
	public void collisonShape() {
		
		
	}
	//----------------Gets&Sets-----------
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	

}
