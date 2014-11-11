package logic;
/**
 * Clase donde estar la conenxion entre la interfaz y la logica&&&
 * Class where the conenxion be between the interface and logic
 * @author Jenny Paola Quesada Hernandez
 *
 */
public class Game {
	//---------------Attribute----------------
	/**
	 * Atributo de la clase hilo%%%
	 * Attribute of the class thread
	 */
	private Hilo hilo;
	/**
	 * Atributo de la clase Square%%%
	 * The Square class Attribute
	 */
	private Square square;
	/**
	 * 
	 */
	private Triangle triangle;
	private	Matrix matrix;
	/**
	 * Atributo de la clase Jugador%&%&%&%&&
	 * Player class attribute
	 */
	private Player player;
	//---------------Builders----------------
	public Game() {
		/**
		 * Creamos la matriz
		 */
		matrix = new Matrix();
		matrix.generateMatriz();

		player = new Player(10,10,2,2,'#');
		square = new Square(2,2,4,4);
		square.generateShape(matrix);
			
		matrix.showMatriz();
		
		hilo = new Hilo(square);
		hilo.iniciar();
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					matrix.generateMatriz();
					square.generateShape(matrix);
					player.generateShape(matrix);
					matrix.showMatriz();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
