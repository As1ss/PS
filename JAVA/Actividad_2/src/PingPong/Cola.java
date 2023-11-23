package PingPong;

public class Cola {
	private String cadena;
	private boolean disponible = false;

	public synchronized String get() {
		while (disponible == false) {
			try {
				wait();

			} catch (InterruptedException e) {
				System.err.println("Error de hilo.");
			}
		}
		disponible = false;
		notify();
		return cadena;

	}

	public synchronized void put(String cadenaProductor) {
		while (disponible == true) {
			try {
				wait();
			} catch (Exception e) {
				System.err.println("Error de hilo.");
			}
		}
		disponible = true;
		cadena = cadenaProductor;
		notify();
	}
}
