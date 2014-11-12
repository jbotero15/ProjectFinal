package logic;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Class where the circle will be created for the settlement of Figures
 * @author Jenny Pola Quesada Hernandez
 */

public class Circle  extends Shape{
	//--------------Cosntants----------
	/**
	 * Color circuference
	 */
	private static String DEFAUL_COLOR = "#C8FE2E" ;
	//--------------Attributes---------
	/**
	 * circle radius
	 */
	private int radius;
	
	//--------------Builders-----------
	/**
	 * creates a new object circumference
	 */
	public Circle(int x , int y, int radius) {
		this.x = x;
		this.y = y ;
		this.radius = radius ;
	}
	//--------------Methods------------
	@Override
	public void generateShape(Graphics graphics) {
		
		graphics.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		graphics.setColor(Color.decode(DEFAUL_COLOR));
	
		
	}
	@Override
	public void collisonShape() {
		
		
	}
	//--------------Gets&Sets----------
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
	
}
