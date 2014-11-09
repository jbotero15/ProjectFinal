package logic;

import javax.swing.JOptionPane;

public class Hilo extends Thread {

	private boolean ejecution;
	private boolean pause;
	private Square square;

	public Hilo() {
		// TODO Auto-generated constructor stub
	}

	public Hilo(Square square) {
		this.square = square;
	}

	public void iniciar() {
		ejecution = true;
		start();
	}

	public void detener() {
		ejecution = false;
	}

	public void pausar() {
		pause = true;
	}

	public void reanudar() {
		pause = false;
	}

	@Override
	public void run() {
		while (ejecution) {
			square.moveDown();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while (pause) {
				System.out.println("Pausa Hilo");
			}
		}
	}

//	public static void main(String[] args) {
//		HiloObstacle hiloObstacle = new HiloObstacle();
//		hiloObstacle.iniciar();
//		String p = JOptionPane.showInputDialog("");
//		if (p.equals("p")) {
//			hiloObstacle.pausar();
//		}
//		p = JOptionPane.showInputDialog("");
//		if (p.equals("r")) {
//			hiloObstacle.reanudar();
//		}
//	}
}
