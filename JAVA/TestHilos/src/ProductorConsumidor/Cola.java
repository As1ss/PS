package ProductorConsumidor;

public class Cola {

	String mensaje;
	boolean disponible = false;

	public synchronized String get() {
		while (!disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notify();
		disponible = false;
		return mensaje;
	}

	public synchronized void put(String newMensaje) {
		while (disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		mensaje = newMensaje;
		disponible = true;
		notify();
	}
}
