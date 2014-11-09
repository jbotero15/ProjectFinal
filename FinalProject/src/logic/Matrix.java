package logic;
/**
 * Se dibujara las figuras por consola
 * @author Jenny Quesada
 *
 */
public class Matrix {
	//------------------Constants--------------------
	/**
	 * Cantidad de columnas de la matriz
	 */
	public static int DEFAULT_COLUMNS = 50;
	/**
	 * Cantidad de filas de la matriz
	 */
	public static int DEFAULT_ROWS = 20;
	/**
	 * Caracter con el que se dibujara la figura
	 */
	public static char DEFAULT_CHARACTER ='.';
	
	//---------------Attributes-------------------
	/**
	 * donde se almacenaran las figuras
	 */
	private char matrix [][] ;
	/**
	 * cantidad maxima de filas
	 */
	private int rows;
	/**
	 * Cantidad maxima de columnas.
	 */
	private int columns;
	
	//----------------Builders-----------------
	/**
	 * Metdos constructor de la matriz sin parametros
	 */
	public Matrix(){
		setRows(DEFAULT_ROWS);
		setColumns(DEFAULT_COLUMNS);
		setMatrix(new char[rows][columns]);
	}
	//----------------Methods-----------------
	/**
	 * Metodo de generar la matriz por consola
	 */
	public void generateMatriz(){
		for(int i = 0 ;i<rows ;i++){
			System.out.println();
			for(int j= 0 ; j<columns; j++){
				System.out.print(matrix [i][j] = DEFAULT_CHARACTER);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public void showMatriz(){
		for(int i = 0 ;i<rows ;i++){
			System.out.println();
			for(int j= 0 ; j<columns; j++){
				System.out.print(matrix [i][j]);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
	//----------------Gets&Sets---------------

	public char[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(char[][] matrix) {
		this.matrix = matrix;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}
