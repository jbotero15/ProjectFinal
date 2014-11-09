package logic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

/**
 * Clase donde se graficara las figuras geometricas y se realizaran los metodos corres�ndiente que se 
 * extienden de la clase abstracta figura
 * @author Jenny Quesada 
 *
 */

public class Player extends Shape {
	//------------------Attributes---------------
	/**
	 * Tama�o de la figura a dibujar
	 */
	private int size;
	
	//-------------Builders-----------------------
	/**
	 * Donde se construye la figura sin parametros
	 */
	public Player() {
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
	
	 public Player(int x,int y, int width, int heigth,char character){
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
	 public Player(int x, int y, int width,int heigth){
		 
		 super(x,y,width,heigth,DEFAULT_CHARACTER);
		 setSize((width+heigth)/2);
	 }
	//------------------Methods----------------
	 /**
	  * Algoritmo para genera el cuadrado en la matriz
	  */
	@Override
	public void generateShape(Matrix matrix) {
		
	//Generamos los lados superior e inferior del cuadrado
		for(int i = x ; i<x+width;i++){
			matrix.getMatrix()[y][i]= DEFAULT_CHARACTER;
			matrix.getMatrix()[y+higth-1][i]= DEFAULT_CHARACTER;
			
		}
		//Generamos los lados laterales
		for (int j = y; j < y+higth; j++) {
			matrix.getMatrix()[j][x] = DEFAULT_CHARACTER;
			matrix.getMatrix()[j][x+width-1] =DEFAULT_CHARACTER;
		}
	
		
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