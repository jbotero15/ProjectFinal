package logic;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase donde se graficara las figuras geometricas y se realizaran los metodos corresóndiente que se 
 * extienden de la clase abstracta figura
 * @author Jenny Quesada 
 *
 */

public class Square extends Shape {
	//------------------Attributes---------------
	/**
	 * Tamaño de la figura a dibujar
	 */
	private int size;
	
	//-------------Builders-----------------------
	/**
	 * Donde se construye la figura sin parametros
	 */
	public Square() {
		/**
		 * Arreglar  la palabra HIGTH
		 */
		setSize((width+higth)/2);
	
	}
	/**
	 * Parametro donde cosntruye las opciones que el usuario pede ingresar
	 * @param x
	 * @param y
	 * @param width
	 * @param heigth
	 * @param character
	 */
	
	 public Square(int x,int y, int width, int heigth,char character){
		 /**
		  * Super invoca los metodos de la superclase  desde esta subclase
		  */
		 super(x,y,width,heigth,character);
		 setSize((width+heigth)/2);
	 }
	 /**
	  * Parametros que el usuario puede ingresar 
	  * @param x
	  * @param y
	  * @param width
	  * @param heigth
	  */
	 public Square(int x, int y, int width,int heigth){
		 
		 super(x,y,width,heigth,DEFAULT_CHARACTER);
		 setSize((width+heigth)/2);
	 }
	//------------------Methods----------------
	 /**
	  * Algoritmo para genera el cuadrado en la matriz
	  */
	@Override
	public void generateShape(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, higth);
		
	}
	
	@Override
	public void collisonShape() {
		
		
	}
	//-------------Gets&Sets--------------------
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}


}
