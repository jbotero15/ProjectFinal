package test;

import logic.Matrix;
import logic.Square;

/**
 * Clase do pruebas donde se probara todo  
 * el programa por consola
 * @author Jenny Quesada
 *
 */
public class TestConsole {
	/**
	 * Metodo principal de programa para que se ejecute el programa 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Matrix matrix = new Matrix();
		System.out.println("Paola");
		matrix.generateMatriz();
		
		Square square = new Square();
		square.generateShape(matrix);
	}

}
