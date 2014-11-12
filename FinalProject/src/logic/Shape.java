package logic;

import java.awt.Graphics;

/**
 * Abstract kind of figure which will be the obstacles to the application, such as 
 * square, triangle, rectangle, circle is created
 * @author Jenny Paola
 *
 */

public abstract  class Shape {
	//----------------Attribute---------------
	/**
	 * X coordinate where the figure began
	 */
	protected int x ;
	/**
	 * Y coordinate where the figure began
	 */
	protected int y;
	/**
	 *Width of geometric figures
	 */
	protected int width;
	/**
	 * High of geometric figures
	 */
	protected int higth;
	/**
	 * players displacement
	 */
	
	protected int desplazamiento = 2;
	
	//----------------Builders------------------
	/**
	 * figure object type is created with not parameters
	 */
	public Shape() {
		setX(x);
		setY(y);
		setWidth(width);
		setHigth(higth);
	}
	/**
	 * an object of type parameters figure is created
	 * @param x
	 * @param y
	 * @param width
	 * @param heigth
	 * @param caracter
	 */
	public Shape(int x, int y, int width, int heigth){
		setX(x);
		setY(y);
		setWidth(width);
		setHigth(heigth);
		
	}
	//----------------Methods-------------------
	/**
	 * Generates the shape of the figure
	 */
	public abstract void generateShape(Graphics graphics);
	/**
	 *Collision between the figure and the obstacles
	 */
	public abstract void collisonShape();
	/**
	 * figures moving down
	 */
	public void moveDown(){
		y += desplazamiento;
	}
	/**
	 * figures moving up
	 */
	public void moveUp(){
		y -= desplazamiento;
	}
	/**
	 * left movement figures
	 */
	public void moveLeft(){
		x -= desplazamiento;
	}
	/**
	 * right movement figures
	 */
	public void moveRight(){
		x += desplazamiento;
	}
	
	//----------------Get&Set-------------------

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHigth() {
		return higth;
	}

	public void setHigth(int higth) {
		this.higth = higth;
	}


}
