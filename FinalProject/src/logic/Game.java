package logic;

public class Game {

	private Hilo hilo;
	private Square square;
	private	Matrix matrix;
	private Player player;
	
	public Game() {
		matrix = new Matrix();
		matrix.generateMatriz();

		player = new Player(10,10,2,2,'#');
		square = new Square(2,2,4,4);
		square.generateShape(matrix);
		
		matrix.showMatriz();
		
		hilo = new Hilo(square);
		hilo.iniciar();
		
		Thread t = new Thread(new Runnable() {
			
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
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
