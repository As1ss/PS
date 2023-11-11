package PingPong;

public class Productor extends Thread {
	private Cola cola;
	private String cadena;

	public Productor(Cola c, String cadenaInput) {
		cola = c;
		this.cadena = cadenaInput;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (cadena == " PING ") {
				cadena = " PONG ";
			} else {
				cadena = " PING ";
			}
			cola.put(cadena);
		}

		try {
			sleep(100);
		} catch (Exception e) {
			System.err.println("Error de hilo.");
		}
	}
}
