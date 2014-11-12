package logic;
/**
 * Class where the conenxion be between the interface and logic
 * @author Jenny Paola Quesada Hernandez
 *
 */
public class Game {
	//---------------Attribute----------------
	/**
	 * Attribute of the class thread
	 */
	private Hilo hilo;
	/**
	 * The Square class Attribute
	 */
	private Square square;
	/**
	 * Logic Class Villain
	 */
	private Villain villain;
	/**
	 * Player class attribute
	 */
	private Player player;
	/**
	 * 
	 */
	private Circle circle;
	/**
	 * 
	 */
	private Rectangle rectangle;
	//---------------Builders----------------
	public Game() {
		/**
		 * create a new player
		 */
		player = new Player(20,20,70,70);
		/**
		 * create a new Square
		 */
		square = new Square(80,80,40,40);
		/**
		 * create a new villain.
		 */
		villain = new Villain(100, 100,70,70);
		
		/**
		 * 
		 */
		circle = new Circle(400, 400,40);
		/**
		 * 
		 */
		rectangle = new Rectangle(50, 50,60,30);
		/**
		 * a new thread is created to execute
		 */
		hilo = new Hilo();
		hilo.iniciar();
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
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
	//------------------Methods----------
	//------------------GetsY Sets--------
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}
	public Hilo getHilo() {
		return hilo;
	}
	public void setHilo(Hilo hilo) {
		this.hilo = hilo;
	}
	public Villain getVillain() {
		return villain;
	}
	public void setVillain(Villain villain) {
		this.villain = villain;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	
}
