package logic;

import java.awt.Color;
import java.awt.Graphics;

/**
 * class where the methods of the abstract class is created and the figure is created
 * @author Jenny Paola Quesada Hernandez
 */

public class Rectangle extends Shape{
	//-----------Cosntants----------
	/**
	 * Rectangle color
	 */
	private static String DEFAULT_COLOR ="#FFFF00";
	//-----------Attributes---------
	/**
	 * Size Rectangle
	 */
	private int size;
	//-----------Builders-----------
	/**
	 * A new object of type rectangle is created
	 */
	public Rectangle() {
	/**
	 * parameterless constructor
	 */
	setSize((width+higth)/2);
	}
	/**
	 * parameterized constructor
	 * @param x
	 * @param y
	 * @param width
	 * @param heigth
	 */
	public Rectangle(int x, int y, int width, int heigth){
		super(x,y,width,heigth);
		setSize((width+heigth)/2);
	}
	//-----------Methods------------
	@Override
	public void generateShape(Graphics graphics) {
		
		graphics.fillRect(x,y,width,higth);
		graphics.setColor(Color.decode(DEFAULT_COLOR));
		
	}
	@Override
	public void collisonShape() {

		
	}
	
	//-----------Gets&Sets----------
	public static String getDEFAULT_COLOR() {
		return DEFAULT_COLOR;
	}
	public static void setDEFAULT_COLOR(String dEFAULT_COLOR) {
		DEFAULT_COLOR = dEFAULT_COLOR;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
