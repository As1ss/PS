package EjemploHilos7;

public class Hilo extends Thread {

	private long contador;
	private boolean stopHilo;

	public Hilo() {
		contador = 0;
		stopHilo = false;

	}

	@Override
	public void run() {
		super.run();
		while (!stopHilo) {
			contador++;
		}

	}

	public void pararHilo() {

		stopHilo = true;
		System.out.println(Thread.currentThread().getName() + " parado.");

	}

	public long getContador() {

		return contador;
	}
}
