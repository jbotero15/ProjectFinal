package logic;
/**
 * Se crea la clase abstracta de figura donde seran los obstaculos 
 * de la aplicacion, como cuadrado, triangulo, rectangulo,circulo
 * @author Jenny Paola
 *
 */

public abstract  class Shape {
	//----------------Cosntants---------------
	/**
	 * Constante de tipo char que se crea para que dibuje la figura por consola
	 */
	public static char DEFAULT_CHARACTER = '*';
	
	//----------------Attribute---------------
	/**
	 * Coordenada x donde iniciara la figura
	 */
	protected int x ;
	/**
	 * Coordenada Y donde iniciara la figura 
	 */
	protected int y;
	/**
	 * Ancho de las figuras geometricas
	 */
	protected int width;
	/**
	 * Alto de las figuras geometricas
	 */
	protected int higth;
	/**
	 * Caracter utilizado para graficar las figuras geometricas por consola
	 */
	protected char character;
	
	protected int desplazamiento = 1; //
	
	//----------------Builders------------------
	/**
	 * Constructor que se define sin parametros en donde
	 *  los valores ya estaran establecidos
	 */
	public Shape() {
		setX(x);
		setY(y);
		setWidth(width);
		setHigth(higth);
		setCharacter(DEFAULT_CHARACTER);
	}
	/**
	 * Constructor que se genera conparametros donde
	 *  el usuario pueda ingresar los datos que ellos deseen
	 * @param x
	 * @param y
	 * @param width
	 * @param heigth
	 * @param caracter
	 */
	public Shape(int x, int y, int width, int heigth, char caracter){
		setX(x);
		setY(y);
		setWidth(width);
		setHigth(heigth);
		setCharacter(caracter);
	}
	/**
	 * Constructor que se genera conparametros donde
	 * el usuario pueda ingresar los datos que ellos deseen, menos eñcaracter que estara definido
	 * @param x
	 * @param y
	 * @param width
	 * @param heigth
	 */
	public Shape(int x, int y, int width, int heigth){
		setX(x);
		setY(y);
		setWidth(width);
		setHigth(heigth);
		setCharacter(DEFAULT_CHARACTER);
		
		
	}
	//----------------Methods-------------------
	/**
	 * Genera la forma de la figura
	 */
	public abstract void generateShape(Matrix matrix);
	/**
	 * Colision entre la figura y el jugador
	 */
	public abstract void collisonShape();
	/**
	 * 
	 */
	public void moveDown(){
		y += desplazamiento;
	}
	/**
	 * 
	 */
	public void moveUp(){
		y -= desplazamiento;
	}
	/**
	 * 
	 */
	public void moveLeft(){
		x -= desplazamiento;
	}
	/**
	 * 
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

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

}
